USE [subastas]
GO

UPDATE [dbo].[producto]
   SET [color] = <color, varchar(50),>
      ,[material] = <material, varchar(100),>
      ,[talla] = <talla, decimal(7,2),>
      ,[unidadTalla] = <unidadTalla, varchar(50),>
      ,[largo] = <largo, decimal(7,2),>
      ,[unidadLargo] = <unidadLargo, varchar(50),>
      ,[ancho] = <ancho, decimal(7,2),>
      ,[unidadAncho] = <unidadAncho, varchar(50),>
      ,[idProductoBase] = <idProductoBase, int,>
 WHERE <Search Conditions,,>
GO

