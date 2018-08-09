package com.google.sites.danieltcc1.vision;

import java.util.*;

public class Vision {
	private String info;

	private String modelo_escolhido;

	private String language;

	private String country;

	private Locale currentLocale;
	private ResourceBundle messages;

	public Vision(String[] args) {
		if (args.length != 2) {
			language = new String("en");
			country = new String("US");
		} else {
			language = new String(args[0]);
			country = new String(args[1]);
		}

		currentLocale = new Locale(language, country);

		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);

		info = messages.getString("info");

		modelo_escolhido = messages.getString("first_message_chosen_model");
	}

	public void showMessage(String message) {
		System.out.println(message);
	}

	public void first_show(int choice_model, double value1, double value2,
			double value3, double value4, double value5, double value6,
			double value7, double value8) {
		System.out.println("");
		if (choice_model >= 0)
			System.out.println(info + " - " + choice_model + ". Modelo");
		else
			System.out.println(info);
		System.out.println("");
		System.out.println(modelo_escolhido);
		System.out.println("");
		System.out.print(messages.getString("ambient_air_pressure_kpa"));
		System.out.printf("%.2f", value1);
		System.out.println(" kPa.");
		System.out.print(messages.getString("air_temperature_k"));
		System.out.printf("%.2f", value2);
		System.out.println(" K.");
		System.out.print(messages.getString("intake_air_pressure_kpa"));
		System.out.printf("%.2f", value3);
		System.out.println(" kPa.");
		System.out.print(messages.getString("intake_air_mass_flow_kgh"));
		System.out.printf("%.2f", value4);
		System.out.println(" kg/h.");
		System.out.print(messages
				.getString("rotation_frequency_of_the_universal_motor_hz"));
		System.out.printf("%.2f", value5);
		System.out.println(" Hz.");
		System.out.print(messages
				.getString("opening_factor_of_the_electronic_throttle_module"));
		System.out.printf("%.2f", value6);
		System.out.println(".");
		if (choice_model >= 2 && choice_model <= 5) {
			System.out.print(messages.getString("intake_air_full_volum_l"));
			System.out.printf("%.2f", value7);
			System.out.println(" L.");
			System.out.print(messages.getString("air_molar_mass_gmol"));
			System.out.printf("%.2f", value8);
			System.out.println(" g/mol.");
		}

		System.out.println("");
	}

	public void second_show(int choice_model) {
		System.out.println("");

		System.out.println(messages.getString("type_the_desired_option"));
		System.out.println("");
		System.out.println(messages
				.getString("0_stop_the_simulation_and_quit_this_app"));
		System.out.println(messages.getString("1_restart_the_simulation"));
		System.out
				.println(messages
						.getString("2_change_the_rotation_frequency_of_the_universal_motor"));
		System.out
				.println(messages
						.getString("3_change_the_opening_factor_of_the_electronic_throttle_module"));
		System.out.println(messages
				.getString("4_change_the_ambient_air_pressure"));
		if (choice_model >= 2 && choice_model <= 5) {
			System.out.println(messages
					.getString("5_change_the_intake_air_full_volum"));
			System.out.println(messages
					.getString("6_change_the_ambient_air_molar_mass"));
			System.out.println(messages
					.getString("7_change_the_ambient_air_temperature"));
			System.out.println(messages.getString("8_change_the_chosen_model"));
		} else
			System.out.println(messages.getString("5_change_the_chosen_model"));
		System.out.println("");
	}

	public String getMessage(String message) {
		return messages.getString(message);
	}

	public void setModelo_escolhido(String modelo_escolhido) {
		this.modelo_escolhido = modelo_escolhido;
	}
}