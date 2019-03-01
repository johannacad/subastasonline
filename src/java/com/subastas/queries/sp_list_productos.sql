USE [subastas]
GO

SELECT [idProducto]
      ,[color]
      ,[material]
      ,[talla]
      ,[unidadTalla]
      ,[largo]
      ,[unidadLargo]
      ,[ancho]
      ,[unidadAncho]
      ,[idProductoBase]
  FROM [dbo].[producto]
GO

USE [subastas]
GO

SELECT [idProductoBase]
      ,[nombre]
      ,[descripcion]
      ,[precioCompra]
      ,[precioVenta]
  FROM [dbo].[producto_base]
GO

