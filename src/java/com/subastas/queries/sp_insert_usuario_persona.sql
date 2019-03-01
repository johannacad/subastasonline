USE [subastas]
GO

DROP PROCEDURE IF EXISTS sp_insertUsuarioPersona
GO

CREATE PROCEDURE sp_insertUsuarioPersona
	@nombres varchar(150),
	@apellidoPaterno varchar(150),
	@apellidoMaterno varchar(150),
	@dni char(8),
	@email varchar(150),
	@fechaNacimiento date,
    @usuario varchar(100),
	@clave varchar(50),
	@idTipoUsuario int,
	@identity int = NULL output
    AS
    BEGIN
        DECLARE @idPersona int = NULL
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
        SET @idPersona = SCOPE_IDENTITY()

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

