package cuentaBancaria;

public class Cuenta {

	private String nomCliente;
	private String numCuenta;
	private double tipoInteres;
	private double saldo;
	//constructor con parametros
	public Cuenta(String nomCliente, String numCuenta, double tipoInteres, double saldo) {

		this.nomCliente = nomCliente;
		this.numCuenta = numCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	//constructor por defecto
	public Cuenta() {

	}
	//constructor copia
	public Cuenta(Cuenta c) {
		nomCliente = c.nomCliente;
		numCuenta = c.numCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
	}

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean ingreso(double ingreso) {
		 boolean ingresoCorrecto = true;
		if(ingreso<0) {
			ingresoCorrecto = false;
		}else {
			saldo+=ingreso;
		}
		return ingresoCorrecto;
		
	}//ingreso
	public boolean reintegro(double reintegro) {
        boolean reintegroCorrecto = true;
		if(reintegro<0) {
            reintegroCorrecto = false;
		}else if(saldo>=reintegro){
			saldo-=reintegro;
		}
		else {
            reintegroCorrecto = false;
		}
        return reintegroCorrecto;
	}//reintegro
	
	public boolean transferencia(Cuenta c, double importe) {
        boolean correcto = true;

		if (importe<0) {
            correcto = false;
		}else if (saldo>=importe) {
			reintegro(importe);
			c.ingreso(importe);
		}else {
            correcto = false;
		}
		
        return correcto;
		
	}//transferecia
}
