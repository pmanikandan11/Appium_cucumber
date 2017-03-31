CREATE TABLE config (key TEXT PRIMARY KEY, value NONE);
CREATE TABLE job_queue (id TEXT PRIMARY KEY, name TEXT);
CREATE TABLE job (id TEXT PRIMARY KEY, job_queue_id TEXT, timestamp DATE, data BLOB);

CREATE INDEX config_key ON config (key);
CREATE INDEX job_queue_name ON job_queue (name);
CREATE INDEX job_job_queue_id ON job (job_queue_id);

INSERT INTO config (key, value) VALUES ('schemaVersion', 1);
