USE [subastas]
GO

INSERT INTO [dbo].[comentario]
           ([texto]
           ,[fecha]
           ,[idCliente]
           ,[idProducto]
           ,[calificacion])
     VALUES
           (<texto, text,>
           ,<fecha, datetime,>
           ,<idCliente, int,>
           ,<idProducto, int,>
           ,<calificacion, tinyint,>)
GO

