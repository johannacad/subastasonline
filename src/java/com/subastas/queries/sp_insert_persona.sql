USE [subastas]
GO

DROP PROCEDURE IF EXISTS sp_insertPersona
GO

CREATE PROCEDURE sp_insertPersona
	@nombres varchar(150),
	@apellidoPaterno varchar(150),
	@apellidoMaterno varchar(150),
	@dni char(8),
	@email varchar(150),
	@fechaNacimiento date,
	@identity int = NULL output
AS
BEGIN
	INSERT INTO [dbo].[persona_base]
           ([nombres]
           ,[apellidoPaterno]
           ,[apellidoMaterno]
           ,[dni]
           ,[email]
           ,[fechaNacimiento])
     VALUES
           (@nombres
           ,@apellidoPaterno
           ,@apellidoMaterno
           ,@dni
           ,@email
           ,@fechaNacimiento)
	SET @identity = SCOPE_IDENTITY()
END
GO

