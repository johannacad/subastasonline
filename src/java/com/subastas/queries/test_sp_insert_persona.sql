USE subastas
DECLARE @insertedPersonaId int
EXECUTE sp_insertPersona 'Eddy', 'Nuñez', 'More', '43255434', 'eddy@mail.com', '1985-12-09', @insertedPersonaId OUTPUT
SELECT 'inserted id: ', @insertedPersonaId