package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoParaBancos implements Desconto{
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal){
		return precoOriginal.subtract(trintaProcentoDeDesconto(precoOriginal));
	}
	
	private BigDecimal trintaProcentoDeDesconto(BigDecimal precoOriginal){
		return precoOriginal.multiply(new BigDecimal("0.3"));
	}
	
}
