package moum.project;

import moum.project.controller.CrawlServlet; // CrawlServlet import 추가
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

/**
 * packageName    : project
 * fileName       : ServerApp
 * author         : narilee
 * date           : 24. 10. 14.
 * description    : 내장 Tomcat 서버를 설정하고 실행하는 클래스입니다.
 *                  이 클래스는 웹 애플리케이션을 위한 서버 환경을 구성하고 실행합니다.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 14.        narilee       최초 생성
 */
public class ServerApp {

    public static void main(String[] args) {
        try {
            ServerApp app = new ServerApp();
            app.execute();
        } catch (Exception e) {
            System.out.println("서버 실행 중 오류 발생!");
            e.printStackTrace();
        }
    }

    private void execute() throws Exception {
        System.out.println("서버 실행 중...");

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8888);
        tomcat.setBaseDir("temp");
        Connector connector = tomcat.getConnector();
        connector.setURIEncoding("UTF-8");

        // 웹 애플리케이션의 환경 정보 준비
        StandardContext ctx = (StandardContext) tomcat.addWebapp(
                "/", new File("src/main/webapp").getAbsolutePath());
        ctx.setReloadable(true);

        // CrawlServlet 등록
        Tomcat.addServlet(ctx, "CrawlServlet", new CrawlServlet());

        // 서블릿 매핑을 /crawl로 설정
        ctx.addServletMappingDecoded("/crawl", "CrawlServlet"); // 매핑 설정

        WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(
                resources, "/WEB-INF/classes",
                new File("build/classes/java/main/").getAbsolutePath(), "/"));
        ctx.setResources(resources);

        tomcat.start();
        tomcat.getServer().await();
        System.out.println("서버 종료!");
    }

}
