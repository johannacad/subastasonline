USE subastas
DECLARE @insertedUsuarioId INT
EXECUTE sp_insertUsuario 'luis', 'lp123', 1, 1, @insertedUsuarioId OUTPUT
SELECT 'inserted id: ', @insertedUsuarioId