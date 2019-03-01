USE [subastas]
GO

DROP PROCEDURE IF EXISTS sp_insertProducto
GO

CREATE PROCEDURE sp_insertProducto
	@nombre varchar(150),
	@descripcion varchar(150),
	@precioCompra varchar(150),
	@precioVenta char(8),
	@identity int = NULL output
AS
BEGIN
	INSERT INTO [dbo].[producto_base]
           ([nombre]
           ,[descripcion]
           ,[precioCompra]
           ,[precioVenta])
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

