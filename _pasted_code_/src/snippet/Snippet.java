package snippet;

public class Snippet {
	create database bd_inti;
	
	use bd_inti;
	
	/*Tabla ADMINISTRADOR*/
	create table tb_administrador
	(
	cod_adm int primary key auto_increment,
	nomb_adm varchar(30),
	ape_admi varchar(30),
	login_admi varchar(20),
	clave_admi varchar(20)
	);
	
	/*Insertamos en la tabla ADMINISTRADOR*/
	insert into tb_administrador values(1,'Ronaldo','Lobato','lobato123','adm');
	insert into tb_administrador values(2,'Luz','Alcala','alcala123','adm');
	insert into tb_administrador values(3,'Yovanita','Dominguez','dominguez123','adm');
	insert into tb_administrador values(4,'Renzo','Leon','leon123','adm');
	
	/*Hacemos la consulta*/
	select * from tb_administrador;
	
	/*Tabla Mantenimiento Producto*/
	/*---------------------------*/
	
	/*Tabla Marca*/
	create table tb_marca
	(
	id_marc int primary key,
	nomb_marc varchar(30)
	);
	insert into tb_marca(id_marc,nomb_marc)  values (1,'LG'),
													(2,'Indurama'),
													(3,'Samsung'),
													(4,'Imaco'),
													(5,'Electrolux'),
													(6,'Oster');
	
	
	select * from tb_marca;
	
	/*Tabla Almacenamiento*/
	create table tb_almacenamiento
	(
	id_alm int primary key,
	nomb_alm varchar(40)
	);
	
	insert into tb_almacenamiento(id_alm,nomb_alm) values  (1,'Microondas'),
													 (2,'Equipo de calefacción'),
												     (3,'Ventilador'),
													 (4,'Cocina'),
													 (5,'Congeladores'),
													 (6,'Horno'),
													 (7,'Refrigeradorora'),
													 (8,'Frigorificos'),
													 (9,'Campanas extractoras');
	
	select * from tb_almacenamiento;
	
	/*Tabla Producto*/
	CREATE TABLE tb_producto (
	  id_prod INT AUTO_INCREMENT primary key,
	  id_alm INT REFERENCES tb_almacenamiento,
	  id_marc INT REFERENCES tb_marca,
	  stock_prod INT,
	  precio_prod DECIMAL(8, 2)
	);
	
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(5,2,12,3.50);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(6,1,2,11.50);  
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(2,4,20,30.350);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(1,3,15,25.50);
	                    
	                    insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(5,2,12,3.50);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(6,1,2,11.50);  
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(2,4,20,30.350);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(1,3,15,25.50);
	                    insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(5,2,12,3.50);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(6,1,2,11.50);  
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(2,4,20,30.350);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(1,3,15,25.50);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(6,1,2,11.50);  
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(2,4,20,30.350);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(1,3,15,25.50);
	                    insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(5,2,12,3.50);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(6,1,2,11.50);  
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(2,4,20,30.350);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(1,3,15,25.50);
	                    
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(6,1,2,11.50);  
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(2,4,20,30.350);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(1,3,15,25.50);
	                    insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(5,2,12,3.50);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(6,1,2,11.50);  
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(2,4,20,30.350);
	                    
	insert into tb_producto(id_alm,id_marc,stock_prod,precio_prod)
						values(1,3,15,25.50);
	                    
	                    
	select * from tb_producto 
}

