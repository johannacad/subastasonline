USE [subastas]
GO

DROP PROCEDURE IF EXISTS sp_insertUsuario
GO

CREATE PROCEDURE sp_insertUsuario
	@usuario varchar(100),
	@clave varchar(50),
	@idPersona int,
	@idTipoUsuario int,
	@identity int = NULL OUTPUT
AS
BEGIN

	INSERT INTO [dbo].[usuario]
           ([usuario]
           ,[clave]
           ,[idPersona]
           ,[idTipoUsuario])
     VALUES
           (@usuario
           ,@clave
           ,@idPersona
           ,@idTipoUsuario)
	SET @identity = SCOPE_IDENTITY()
END
GO

