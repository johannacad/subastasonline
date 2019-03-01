USE [subastas]
GO

DROP PROCEDURE IF EXISTS sp_insertProducto
GO

CREATE PROCEDURE sp_insertProducto
	@nombres varchar(150),
	@apellidoPaterno varchar(150),
	@apellidoMaterno varchar(150),
	@dni char(8),
	@email varchar(150),
	@fechaNacimiento date,
	@identity int = NULL output
AS
BEGIN

INSERT INTO [dbo].[producto]
           ([color]
           ,[material]
           ,[talla]
           ,[unidadTalla]
           ,[largo]
           ,[unidadLargo]
           ,[ancho]
           ,[unidadAncho]
           ,[idProductoBase])
     VALUES
           (<color, varchar(50),>
           ,<material, varchar(100),>
           ,<talla, decimal(7,2),>
           ,<unidadTalla, varchar(50),>
           ,<largo, decimal(7,2),>
           ,<unidadLargo, varchar(50),>
           ,<ancho, decimal(7,2),>
           ,<unidadAncho, varchar(50),>
           ,<idProductoBase, int,>)


END
GO

