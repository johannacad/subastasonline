USE [subastas]
GO

DROP PROCEDURE IF EXISTS sp_insertCliente
GO

CREATE PROCEDURE sp_insertCliente
	@password varchar(100),
	@cantidadOfertas int,
	@ofertasConcretadas int,
	@idPersona int,
	@identity int = NULL OUTPUT
AS
BEGIN

	INSERT INTO [dbo].[cliente]
           ([password]
           ,[cantidadOfertas]
           ,[ofertasConcretadas])
     VALUES
           (@password
           ,@cantidadOfertas
           ,@ofertasConcretadas)
	SET @identity = SCOPE_IDENTITY()
END
GO

