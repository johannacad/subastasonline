USE [subastas]
GO

INSERT INTO [dbo].[oferta]
           ([idSubasta]
           ,[idCliente]
           ,[fecha]
           ,[monto])
     VALUES
           (<idSubasta, int,>
           ,<idCliente, int,>
           ,<fecha, datetime,>
           ,<monto, decimal(7,2),>)
GO

