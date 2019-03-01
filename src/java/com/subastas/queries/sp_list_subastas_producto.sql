USE [subastas]
GO

SELECT [idSubasta]
      ,[idProducto]
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
      ,[precioActual]
  FROM [dbo].[subasta]
GO

