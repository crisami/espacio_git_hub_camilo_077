package tienda;


public class Principal {
	

	Productos producto_Uno = new Productos();
	Productos producto_Dos = new Productos();
	Productos producto_Tres = new Productos();
	
	Clientes cliente_Uno = new Clientes();
	Clientes cliente_Dos = new Clientes();
	Clientes cliente_Tres = new Clientes();
	
	Vendedores vendedor_Uno = new Vendedores();
	Vendedores vendedor_Dos = new Vendedores();
	Vendedores vendedor_Tres = new Vendedores();
	
	Tiendas tienda_uno = new Tiendas();
	Tiendas tienda_Dos = new Tiendas();
	Tiendas tienda_Tres = new Tiendas();


	public static void main(String []args){
	
		Object id_producto;
		Object id_vendedor;
		Object id_tienda;
		
		System.out.println("poner el id del producto");
		id_producto = Leer.pedirCadena();
		System.out.println("poner el id del vendedor");
		id_vendedor = Leer.pedirCadena();
		System.out.println("poner el id de la tienda");
		id_tienda = Leer.pedirCadena();
		
		if(id_producto != null){
			if(id_tienda != null){
				if(id_vendedor !=null){
					
					
			System.out.println("el id del producto es: "+id_producto);
			System.out.println("el id del vendedor es: "+id_vendedor);
			System.out.println("el id de la tienda es: "+id_tienda);
				}
			}
		}
		}
		
	

	}
	

