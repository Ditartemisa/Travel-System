package sistemaDeVuelos;

public class PrecioVuelo 
{
	
	public static double calcularPrecioVuelo (String salida, String destino)
	{
		double precio = 0.0;
		
		if (salida.equals("San José de Costa Rica (SJO)")&& destino.equals("Ciudad de México (MEX)"))
		{ precio = 500.0;}
		else if (salida.equals("San José de Costa Rica (SJO)") && destino.equals("Calgary, Canadá (YYC)")) 
		{precio = 800.0;}
		else if (salida.equals("San José de Costa Rica (SJO)")&& destino.equals("Cali, Colombia (CLO)"))
		{precio = 400.0;}
		
		if (salida.equals("Ciudad de México (MEX)")&& destino.equals("San José de Costa Rica (SJO)"))
		{ precio = 300.0;}
		else if (salida.equals("Ciudad de México (MEX)") && destino.equals("Calgary, Canadá (YYC)")) 
		{precio = 450.0;}
		else if (salida.equals("Ciudad de México (MEX)")&& destino.equals("Cali, Colombia (CLO)"))
		{precio = 200.0;}
		
		if (salida.equals("Calgary, Canadá (YYC)")&& destino.equals("Ciudad de México (MEX)"))
		{ precio = 600.0;}
		else if (salida.equals("Calgary, Canadá (YYC)") && destino.equals("San José de Costa Rica (SJO)")) 
		{precio = 750.0;}
		else if (salida.equals("Calgary, Canadá (YYC)")&& destino.equals("Cali, Colombia (CLO)"))
		{precio = 500.0;}
		
		if (salida.equals("Cali, Colombia (CLO)")&& destino.equals("Ciudad de México (MEX)"))
		{ precio = 350.0;}
		else if (salida.equals("Cali, Colombia (CLO)") && destino.equals("San José de Costa Rica (SJO)")) 
		{precio =550.0;}
		else if (salida.equals("Cali, Colombia (CLO)")&& destino.equals("Calgary, Canadá (YYC)"))
		{precio = 700.0;}
		
	return precio;
	
	}

	public static double calcularPrecioVuelo1(String string, String string2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
