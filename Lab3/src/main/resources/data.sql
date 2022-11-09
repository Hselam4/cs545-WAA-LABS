-- USERS

INSERT INTO users
    (id, name)
VALUES
    (1, 'bana');

INSERT INTO users
    (id, name)
VALUES
    ( 2, 'Selam');

INSERT INTO users
    (id, name)
VALUES
    ( 3, 'hermon');

INSERT INTO users
    ( id, name)
VALUES
    (4, 'hyab');

INSERT INTO users
    (id, name)
VALUES
    (5, 'abel');

INSERT INTO users
    (id, name)
VALUES
    (6, 'simon');


-- POSTS

INSERT INTO posts
    (id, author, content, title,user_id)
VALUES
    (1, 'Sidney Sheldon', 'Fiction', 'Tell me your dreams', 1);

INSERT INTO posts
    (id, author, content, title,user_id)
VALUES
    ( 2, 'JKRowling', 'Fantasy', 'Harry Potter', 2);

INSERT INTO posts
    (id, author, content, title,user_id)
VALUES
    (3, 'Jordan Peterson', 'Self help', '12 rules of life', 2);

-- COMMENTS

INSERT INTO comments
    (id, name, post_id)
VALUES
    (1, 'Sidney Sheldon', 1);

INSERT INTO comments
    (id, name, post_id)
VALUES
    (2, 'Fantasy', 2);

INSERT INTO comments
    (id, name, post_id)
VALUES
    (3, 'Self help', 2);
