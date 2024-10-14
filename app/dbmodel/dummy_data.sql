-- 유형 대분류 데이터
INSERT INTO maincategory (category_name) VALUES
('레고'),
('신발'),
('건담프라모델');

-- 유형 소분류 데이터
INSERT INTO subcategory (maincategory_id, category_name) VALUES
(1, '시티'),
(1, '스타워즈'),
(1, '테크닉'),
(2, '운동화'),
(2, '구두'),
(2, '샌들'),
(3, 'HG'),
(3, 'RG'),
(3, 'MG');

-- 회원 데이터
INSERT INTO user (email, nickname, password, admin) VALUES
('user1@example.com', '레고매니아', 'password123', 0),
('user2@example.com', '신발控', 'password456', 0),
('user3@example.com', '건담수집가', 'password789', 0),
('admin@example.com', '관리자', 'adminpass', 1);

-- 수집품 데이터
INSERT INTO collection (user_id, subcategory_id, name, status, purchase_date, purchase_place, price, storage_location) VALUES
(1, 1, '레고 시티 경찰서', 5, '2023-01-15', '레고 공식 스토어', 200000, '선반'),
(2, 4, '나이키 에어맥스', 4, '2023-02-20', '나이키 매장', 150000, '신발장'),
(3, 7, 'HG 건담 바바토스', 5, '2023-03-10', '건담베이스', 20000, '진열장'),
(1, 2, '레고 밀레니엄 팔콘', 5, '2023-04-05', '레고 공식 스토어', 300000, '책상');

-- 게시글 데이터
INSERT INTO board (title, content, user_id, view_cout) VALUES
('레고 시티 경찰서 조립기', '새로 산 레고 시티 경찰서 조립 과정과 후기입니다...', 1, 100),
('나이키 에어맥스 리뷰', '편안한 나이키 에어맥스 사용 후기입니다...', 2, 50),
('HG 건담 바바토스 조립 팁', 'HG 건담 바바토스 조립 시 주의할 점과 팁 공유...', 3, 200),
('레고 밀레니엄 팔콘 디스플레이', '레고 밀레니엄 팔콘 디스플레이 방법 공유...', 1, 150);

-- 수집품게시글 데이터
INSERT INTO collection_board (board_id, collection_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4);

-- 댓글 데이터
INSERT INTO comment (user_id, board_id, content) VALUES
(2, 1, '멋진 경찰서네요! 저도 갖고 싶어요.'),
(3, 2, '에어맥스 편안해 보이네요. 저도 구매 고민 중이에요.'),
(1, 3, '바바토스 조립 팁 감사합니다. 많은 도움이 될 것 같아요.'),
(2, 4, '멋진 디스플레이네요! 공간 활용이 인상적입니다.');

-- 추천 데이터
INSERT INTO likes (board_id, user_id) VALUES
(1, 2),
(1, 3),
(2, 1),
(2, 3),
(3, 1),
(3, 2),
(4, 2),
(4, 3);

-- 업적 데이터
INSERT INTO achievement (achievement_id, name, content, photo, acquisition_condition, location) VALUES
('FIRST_POST', '첫 게시글', '첫 번째 게시글을 작성하세요', 'first_post.png', '게시글 1개 작성', '커뮤니티'),
('COLLECTOR_NOVICE', '초보 수집가', '첫 번째 수집품을 등록하세요', 'collector_novice.png', '수집품 1개 등록', '수집품 관리'),
('LEGO_MASTER', '레고 마스터', '레고 수집품 10개를 등록하세요', 'lego_master.png', '레고 수집품 10개 등록', '수집품 관리'),
('SHOE_ENTHUSIAST', '신발 애호가', '신발 수집품 10개를 등록하세요', 'shoe_enthusiast.png', '신발 수집품 10개 등록', '수집품 관리'),
('GUNDAM_PRO', '건담 프로', '건담 프라모델 10개를 등록하세요', 'gundam_pro.png', '건담 프라모델 10개 등록', '수집품 관리');

-- 회원 업적 데이터
INSERT INTO user_achievement (user_id, achievement_id) VALUES
(1, 'FIRST_POST'),
(1, 'COLLECTOR_NOVICE'),
(2, 'FIRST_POST'),
(2, 'COLLECTOR_NOVICE'),
(3, 'FIRST_POST'),
(3, 'COLLECTOR_NOVICE');

-- 게시글 태그 데이터
INSERT INTO board_tag (board_id, tag_name) VALUES
(1, '레고'),
(1, '시티'),
(1, '조립'),
(2, '나이키'),
(2, '에어맥스'),
(2, '운동화'),
(3, '건담'),
(3, 'HG'),
(3, '조립'),
(4, '레고'),
(4, '스타워즈'),
(4, '디스플레이');

-- 신고 카테고리 데이터
INSERT INTO report_category (category_name) VALUES
('스팸'),
('부적절한 콘텐츠'),
('저작권 침해'),
('혐오 발언');

-- 신고 처리 유형 데이터
INSERT INTO report_result_category (result_name) VALUES
('경고'),
('게시물 삭제'),
('계정 정지'),
('신고 기각');