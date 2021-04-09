package com.xworkz.interfacedemo.interface_example.printer_example;

public class InterfaceTest {

	public static void main(String[] args) {
		
		Sony sony = new Sony();
		Epson epson = new Epson();
		Computer computer = new Computer();
		
		computer.slot(epson);
		computer.slot(sony);

	}

}
