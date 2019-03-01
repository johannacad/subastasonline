USE [subastas]
GO

UPDATE [dbo].[subasta]
   SET [idProducto] = <idProducto, int,>
      ,[descripcion] = <descripcion, text,>
      ,[nombre] = <nombre, varchar(150),>
      ,[fechaCreacion] = <fechaCreacion, datetime,>
      ,[fechaInicio] = <fechaInicio, date,>
      ,[fechaFin] = <fechaFin, date,>
      ,[horaInicio] = <horaInicio, time(7),>
      ,[horaFin] = <horaFin, time(7),>
      ,[abierta] = <abierta, bit,>
      ,[completa] = <completa, bit,>
      ,[precioBase] = <precioBase, decimal(7,2),>
      ,[precioActual] = <precioActual, decimal(7,2),>
 WHERE <Search Conditions,,>
GO

