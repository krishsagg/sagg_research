CREATE TABLE component
(
  name name,
  identifier numeric NOT NULL,
  CONSTRAINT pk_comp PRIMARY KEY (identifier)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE component
  OWNER TO postgres;