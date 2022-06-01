-- will check in db full_name column if any data-conflict when casting before execute
ALTER TABLE person
    ALTER COLUMN full_name TYPE integer USING (full_name::integer);