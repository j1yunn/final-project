package moum.project.service;

import java.util.List;
import moum.project.vo.Collection;

public class DefaultCollectionService implements CollectionService {
  @Override
  public void add(Collection collection) throws Exception {

  }

  @Override
  public List<Collection> list() throws Exception {
    return List.of();
  }

  @Override
  public Collection get(int no) throws Exception {
    return null;
  }

  @Override
  public boolean update(Collection collection) throws Exception {
    return false;
  }

  @Override
  public void delete(int no) throws Exception {

  }
}
