-- Table: "Entity"

-- DROP TABLE "Entity";

CREATE TABLE "Entity"
(
  entityname name NOT NULL,
  identifier numeric NOT NULL,
  component numeric,
  CONSTRAINT pk_entity PRIMARY KEY (identifier),
  CONSTRAINT fk_entitycomp FOREIGN KEY (component)
      REFERENCES component (identifier) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE RESTRICT
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Entity"
  OWNER TO postgres;

-- Index: fki_entitycomp

-- DROP INDEX fki_entitycomp;

CREATE INDEX fki_entitycomp
  ON "Entity"
  USING btree
  (component);