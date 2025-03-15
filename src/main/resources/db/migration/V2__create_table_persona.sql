CREATE TABLE persona (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    anime_id UUID NOT NULL REFERENCES anime(id) ON DELETE CASCADE,
    CONSTRAINT fk_persona_anime FOREIGN KEY (anime_id) REFERENCES anime(id)
);