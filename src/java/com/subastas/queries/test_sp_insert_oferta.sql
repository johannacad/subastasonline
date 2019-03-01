USE subastas
DECLARE @insertedPersonaId int
EXECUTE sp_insertPersona '', '', '', '', '', '', @insertedPersonaId OUTPUT
SELECT 'inserted id: ', @insertedPersonaId