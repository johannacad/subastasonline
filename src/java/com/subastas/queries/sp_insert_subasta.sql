USE [subastas]
GO

INSERT INTO [dbo].[subasta]
           ([idProducto]
           ,[descripcion]
           ,[nombre]
           ,[fechaCreacion]
           ,[fechaInicio]
           ,[fechaFin]
           ,[horaInicio]
           ,[horaFin]
           ,[abierta]
           ,[completa]
           ,[precioBase]
           ,[precioActual])
     VALUES
           (<idProducto, int,>
           ,<descripcion, text,>
           ,<nombre, varchar(150),>
           ,<fechaCreacion, datetime,>
           ,<fechaInicio, date,>
           ,<fechaFin, date,>
           ,<horaInicio, time(7),>
           ,<horaFin, time(7),>
           ,<abierta, bit,>
           ,<completa, bit,>
           ,<precioBase, decimal(7,2),>
           ,<precioActual, decimal(7,2),>)
GO

