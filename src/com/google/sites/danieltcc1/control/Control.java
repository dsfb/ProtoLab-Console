package com.google.sites.danieltcc1.control;

import java.util.*;
import com.google.sites.danieltcc1.vision.*;
import com.google.sites.danieltcc1.model.*;

public class Control {

	private Vision vision;

	private A_scientific_experiment_with_the_prototype meu_experimento_prototipo;

	private Scanner sc;

	private int choice_model;

	private int execution;

	public Control(Vision vision) {
		this.vision = vision;
		meu_experimento_prototipo = new A_scientific_experiment_with_the_prototype();

		sc = new Scanner(System.in);

		// fixa��o de valor.
		choice_model = -1;
	}

	/**
	 * Este m�todo serve para reiniciar a simula��o do modelo na execu��o deste
	 * aplicativo.
	 */
	public void restart() {

		// l�gica de inicializa��o
		if (choice_model == -1) {

			// ajuste dos objetos durante a inicializa��o.
			meu_experimento_prototipo.getMy_prototype()
					.getThe_universal_motor_of_the_prototype()
					.setRotation_frequency_Hz(0);
			meu_experimento_prototipo.getMy_prototype()
					.getThe_electronic_throttle_module_of_the_prototype()
					.setCurrent_opening_factor(0);

			meu_experimento_prototipo.getAmbient_air().setPressure_kPa(94.99);
			meu_experimento_prototipo.getAmbient_air().setTemperature_kelvin(
					300.0);
			meu_experimento_prototipo.getMy_prototype()
					.getThe_air_inside_the_prototype()
					.setTemperature_kelvin(300);
			meu_experimento_prototipo.getMy_prototype()
					.getThe_air_inside_the_prototype().setPressure_kPa(94.99);

			meu_experimento_prototipo.getAmbient_air().setMass_flow_kg_h(0);
			meu_experimento_prototipo.getMy_prototype()
					.getThe_air_inside_the_prototype().setMass_flow_kg_h(0);

			// l�gica de reinicializa��o para os primeiros modelos.
		} else if (choice_model == 1) {

			// ajuste dos objetos durante a reinicializa��o.
			meu_experimento_prototipo.getMy_prototype()
					.getThe_universal_motor_of_the_prototype()
					.setRotation_frequency_Hz(0);
			meu_experimento_prototipo.getMy_prototype()
					.getThe_electronic_throttle_module_of_the_prototype()
					.setCurrent_opening_factor(0);

			meu_experimento_prototipo.getMy_prototype().getModel_map()
					.setInput1(0);
			meu_experimento_prototipo.getMy_prototype().getModel_map()
					.setInput2(0);
			meu_experimento_prototipo.getMy_prototype().getModel_map()
					.setOutput();
			meu_experimento_prototipo.getAmbient_air().setPressure_kPa(
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.getOutput());
			meu_experimento_prototipo.getAmbient_air().setTemperature_kelvin(
					300.0);
			meu_experimento_prototipo
					.getMy_prototype()
					.getThe_air_inside_the_prototype()
					.setTemperature_kelvin(
							meu_experimento_prototipo.getAmbient_air()
									.getTemperature_kelvin());
			meu_experimento_prototipo
					.getMy_prototype()
					.getThe_air_inside_the_prototype()
					.setPressure_kPa(
							meu_experimento_prototipo.getAmbient_air()
									.getPressure_kPa());

			meu_experimento_prototipo.getMy_prototype().getModel_maf()
					.setInput1(0);
			meu_experimento_prototipo.getMy_prototype().getModel_maf()
					.setInput2(0);
			meu_experimento_prototipo.getMy_prototype().getModel_maf()
					.setOutput();
			meu_experimento_prototipo.getAmbient_air().setMass_flow_kg_h(
					meu_experimento_prototipo.getMy_prototype().getModel_maf()
							.getOutput());
			meu_experimento_prototipo
					.getMy_prototype()
					.getThe_air_inside_the_prototype()
					.setMass_flow_kg_h(
							meu_experimento_prototipo.getAmbient_air()
									.getMass_flow_kg_h());

			// l�gica de reinicializa��o para os segundos, terceiros, quartos e
			// quintos modelos.
		} else if (choice_model >= 2 && choice_model <= 5) {

			// ajuste dos objetos durante a reinicializa��o.
			meu_experimento_prototipo.getMy_prototype()
					.getThe_universal_motor_of_the_prototype()
					.setRotation_frequency_Hz(0);
			meu_experimento_prototipo.getMy_prototype()
					.getThe_electronic_throttle_module_of_the_prototype()
					.setCurrent_opening_factor(0);

			meu_experimento_prototipo.getMy_prototype().getModel_map()
					.setInput1(0);
			meu_experimento_prototipo.getMy_prototype().getModel_map()
					.setInput2(0);
			meu_experimento_prototipo.getMy_prototype().getModel_map()
					.setPressure_kPa(94.99);
			meu_experimento_prototipo.getMy_prototype().getModel_map()
					.setVolum_L(0.53751);
			meu_experimento_prototipo.getMy_prototype().getModel_map()
					.setMolar_mass_g_mol(28.96);
			meu_experimento_prototipo.getMy_prototype().getModel_map()
					.setTemperature_k(300);
			meu_experimento_prototipo.getMy_prototype().getModel_map()
					.setOutput();

			meu_experimento_prototipo.getAmbient_air().setPressure_kPa(
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.getPressure_kPa());
			meu_experimento_prototipo.getAmbient_air().setTemperature_kelvin(
					300);
			meu_experimento_prototipo.getAmbient_air().setVolum_liters(
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.getVolum_L());
			meu_experimento_prototipo.getAmbient_air().setAir_molar_mass_g_mol(
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.getMolar_mass_g_mol());

			meu_experimento_prototipo
					.getMy_prototype()
					.getThe_air_inside_the_prototype()
					.setTemperature_kelvin(
							meu_experimento_prototipo.getAmbient_air()
									.getTemperature_kelvin());
			meu_experimento_prototipo
					.getMy_prototype()
					.getThe_air_inside_the_prototype()
					.setPressure_kPa(
							meu_experimento_prototipo.getAmbient_air()
									.getPressure_kPa());
			meu_experimento_prototipo
					.getMy_prototype()
					.getThe_air_inside_the_prototype()
					.setVolum_liters(
							meu_experimento_prototipo.getMy_prototype()
									.getModel_map().getVolum_L());
			meu_experimento_prototipo
					.getMy_prototype()
					.getThe_air_inside_the_prototype()
					.setAir_molar_mass_g_mol(
							meu_experimento_prototipo.getMy_prototype()
									.getModel_map().getMolar_mass_g_mol());

			meu_experimento_prototipo.getMy_prototype().getModel_maf()
					.setInput1(0);
			meu_experimento_prototipo.getMy_prototype().getModel_maf()
					.setInput2(0);
			meu_experimento_prototipo.getMy_prototype().getModel_maf()
					.setOutput();
			meu_experimento_prototipo.getAmbient_air().setMass_flow_kg_h(
					meu_experimento_prototipo.getMy_prototype().getModel_maf()
							.getOutput());
			meu_experimento_prototipo
					.getMy_prototype()
					.getThe_air_inside_the_prototype()
					.setMass_flow_kg_h(
							meu_experimento_prototipo.getAmbient_air()
									.getMass_flow_kg_h());

			// l�gica de reinicializa��o para outras situa��es.
		} else {

		}

		// fixa��o de valor;
		execution = 0;

	}

	public void execution() {
		// declara��o e instancia��o de vari�vel.
		int i = 1;

		// l�gica de execu��o.
		while (i > 0) {
			this.vision
					.first_show(
							choice_model,
							meu_experimento_prototipo.getAmbient_air()
									.getPressure_kPa(),
							meu_experimento_prototipo.getAmbient_air()
									.getTemperature_kelvin(),
							meu_experimento_prototipo.getMy_prototype()
									.getThe_air_inside_the_prototype()
									.getPressure_kPa(),
							meu_experimento_prototipo.getMy_prototype()
									.getThe_air_inside_the_prototype()
									.getMass_flow_kg_h(),
							meu_experimento_prototipo.getMy_prototype()
									.getThe_universal_motor_of_the_prototype()
									.getRotation_frequency_Hz(),
							meu_experimento_prototipo
									.getMy_prototype()
									.getThe_electronic_throttle_module_of_the_prototype()
									.getCurrent_opening_factor(),
							meu_experimento_prototipo.getMy_prototype()
									.getThe_air_inside_the_prototype()
									.getVolum_liters(),
							meu_experimento_prototipo.getAmbient_air()
									.getAir_molar_mass_g_mol());

			if (execution == 0) {
				this.vision.showMessage(this.vision
						.getMessage("the_simulation_was_started_step")
						+ execution);
				execution = execution + 1;
			} else {
				this.vision.showMessage(this.vision
						.getMessage("the_simulation_is_in_progress_step")
						+ execution);
				execution = execution + 1;

				if (execution < 0)
					execution = 0;
			}

			for (boolean continuefor = true; continuefor;) {
				try {
					for (boolean continuetry = true; continuetry;) {

						this.vision.second_show(choice_model);

						// rotina de obten��o de dados do dispositivo de
						// entrada.
						i = sc.nextInt();
						if (choice_model >= 2 && choice_model <= 5) {
							if (i > 8 || i < 0) {
								this.vision
										.showMessage(this.vision
												.getMessage("you_must_enter_between_0_and_8"));
								throw new Exception_models();
							}
							if (i <= 8 && i >= 0)
								continuetry = false;
						} else {
							if (i > 5 || i < 0) {
								this.vision
										.showMessage(this.vision
												.getMessage("you_must_enter_between_0_and_5"));
								throw new Exception_models();
							}
							if (i <= 5 && i >= 0)
								continuetry = false;
						}
						continuefor = false;
					}
				} catch (InputMismatchException inputMismatchException) {
					sc.nextLine();
					if (choice_model >= 2 && choice_model <= 5)
						this.vision.showMessage(this.vision
								.getMessage("you_must_enter_between_0_and_8"));
					else
						this.vision.showMessage(this.vision
								.getMessage("you_must_enter_between_0_and_5"));
				} catch (Exception_models exc) {
					sc.nextLine();
				}
			}

			// l�gica para a primeira op��o.
			if (i == 1) {
				restart();
			}

			// l�gica para a segunda op��o.
			else if (i == 2) {

				// declara��o e instancia��o de vari�vel.
				double new_variable = 0;

				// l�gica de obten��o de dados do dispositivo de entrada e
				// ajuste posterior dos objetos
				// relacionados com a frequ�ncia de rota��o do motor universal.
				for (boolean continuefor = true; continuefor;) {
					try {
						for (boolean continuetry = true; continuetry;) {

							this.vision
									.showMessage(this.vision
											.getMessage("enter_the_new_rotation_frequency_of_the_universal_motor_value_hz"));
							new_variable = sc.nextDouble();

							if (new_variable > 280 || new_variable < 0) {
								this.vision
										.showMessage(this.vision
												.getMessage("you_must_enter_between_0_and_280"));
								throw new Exception_models();
							}
							if (new_variable <= 280 && new_variable >= 0)
								continuetry = false;
						}
						continuefor = false;
					} catch (InputMismatchException inputMismatchException) {
						sc.nextLine();
						this.vision
								.showMessage(this.vision
										.getMessage("you_must_enter_with_only_a_comma"));
					} catch (Exception_models exc) {
						sc.nextLine();
					}
				}

				if (choice_model > 0 && choice_model < 6)
					meu_experimento_prototipo.getMy_prototype()
							.getThe_universal_motor_of_the_prototype()
							.setRotation_frequency_Hz(new_variable);
				else
					this.vision
							.showMessage(this.vision
									.getMessage("please_choose_a_model_before_changing_any_parameters"));
				if (choice_model > 0 && choice_model < 6) {
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setInput1(new_variable);
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setOutput();
					meu_experimento_prototipo
							.getMy_prototype()
							.getThe_air_inside_the_prototype()
							.setPressure_kPa(
									meu_experimento_prototipo.getMy_prototype()
											.getModel_map().getOutput());

					meu_experimento_prototipo.getMy_prototype().getModel_maf()
							.setInput1(new_variable);
					meu_experimento_prototipo.getMy_prototype().getModel_maf()
							.setOutput();
					meu_experimento_prototipo
							.getMy_prototype()
							.getThe_air_inside_the_prototype()
							.setMass_flow_kg_h(
									meu_experimento_prototipo.getMy_prototype()
											.getModel_maf().getOutput());
				}
			}

			// l�gica para a terceira op��o.
			else if (i == 3) {

				// declara��o e instancia��o de vari�vel.
				double new_variable = 0;

				// l�gica de obten��o de dados do dispositivo de entrada e
				// ajuste posterior dos objetos
				// relacionados com o fator de abertura do m�dulo v�lvula
				// borboleta.
				for (boolean continuefor = true; continuefor;) {
					try {
						for (boolean continuetry = true; continuetry;) {

							this.vision
									.showMessage(this.vision
											.getMessage("enter_the_new_opening_factor_of_the_electronic_throttle_module_value"));
							new_variable = sc.nextDouble();

							if (new_variable > 1 || new_variable < 0) {
								this.vision
										.showMessage(this.vision
												.getMessage("you_must_enter_between_0_and_1"));
								throw new Exception_models();
							}
							if (new_variable <= 1 && new_variable >= 0)
								continuetry = false;
						}
						continuefor = false;
					} catch (InputMismatchException inputMismatchException) {
						sc.nextLine();
						this.vision
								.showMessage(this.vision
										.getMessage("you_must_enter_with_only_a_comma"));
					} catch (Exception_models exc) {
						sc.nextLine();
					}
				}

				if (choice_model > 0 && choice_model < 6)
					meu_experimento_prototipo
							.getMy_prototype()
							.getThe_electronic_throttle_module_of_the_prototype()
							.setCurrent_opening_factor(new_variable);
				else
					this.vision
							.showMessage(this.vision
									.getMessage("please_choose_a_model_before_changing_any_parameters"));

				if (choice_model > 0 && choice_model < 6) {
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setInput2(new_variable);
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setOutput();
					meu_experimento_prototipo
							.getMy_prototype()
							.getThe_air_inside_the_prototype()
							.setPressure_kPa(
									meu_experimento_prototipo.getMy_prototype()
											.getModel_map().getOutput());

					meu_experimento_prototipo.getMy_prototype().getModel_maf()
							.setInput2(new_variable);
					meu_experimento_prototipo.getMy_prototype().getModel_maf()
							.setOutput();
					meu_experimento_prototipo
							.getMy_prototype()
							.getThe_air_inside_the_prototype()
							.setMass_flow_kg_h(
									meu_experimento_prototipo.getMy_prototype()
											.getModel_maf().getOutput());
				}
			}

			// l�gica para a quarta op��o.
			else if (i == 4) {

				// declara��o e instancia��o de vari�vel.
				double new_variable = 0;

				// l�gica de obten��o de dados do dispositivo de entrada e
				// ajuste posterior dos objetos
				// relacionados com a press�o do ar ambiente.
				for (boolean continuefor = true; continuefor;) {
					try {
						for (boolean continuetry = true; continuetry;) {

							this.vision
									.showMessage(this.vision
											.getMessage("enter_the_new_ambient_air_pressure_value"));
							new_variable = sc.nextDouble();

							if (new_variable < 0) {
								this.vision
										.showMessage(this.vision
												.getMessage("you_must_enter_greater_than_equal_0"));
								throw new Exception_models();
							}
							if (new_variable >= 0)
								continuetry = false;
						}
						continuefor = false;
					} catch (InputMismatchException inputMismatchException) {
						sc.nextLine();
						this.vision
								.showMessage(this.vision
										.getMessage("you_must_enter_with_only_a_comma"));
					} catch (Exception_models exc) {
						sc.nextLine();
					}
				}

				if (choice_model > 0 && choice_model < 6) {
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setPressure_kPa(new_variable);
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setOutput();
				}
				if (choice_model > 0 && choice_model < 6)
					meu_experimento_prototipo.getAmbient_air().setPressure_kPa(
							new_variable);
				else
					this.vision
							.showMessage(this.vision
									.getMessage("please_choose_a_model_before_changing_any_parameters"));

				if (choice_model > 0 && choice_model < 6)
					meu_experimento_prototipo
							.getMy_prototype()
							.getThe_air_inside_the_prototype()
							.setPressure_kPa(
									meu_experimento_prototipo.getMy_prototype()
											.getModel_map().getOutput());
			}

			// l�gica para a quinta op��o com os modelos fenomenol�gicos.
			else if (i == 5 && choice_model >= 2 && choice_model <= 5) {

				// declara��o e instancia��o de vari�vel.
				double new_variable = 0;

				// l�gica de obten��o de dados do dispositivo de entrada e
				// ajuste posterior dos objetos
				// relacionados com o volume total do ar admitido.
				for (boolean continuefor = true; continuefor;) {
					try {
						for (boolean continuetry = true; continuetry;) {

							this.vision
									.showMessage(this.vision
											.getMessage("enter_the_new_intake_air_full_volum_value"));
							new_variable = sc.nextDouble();

							if (new_variable <= 0) {
								this.vision
										.showMessage(this.vision
												.getMessage("you_must_enter_greater_than_equal_0"));
								throw new Exception_models();
							}
							if (new_variable > 0)
								continuetry = false;
						}
						continuefor = false;
					} catch (InputMismatchException inputMismatchException) {
						sc.nextLine();
						this.vision
								.showMessage(this.vision
										.getMessage("you_must_enter_with_only_a_comma"));
					} catch (Exception_models exc) {
						sc.nextLine();
					}
				}
				if (choice_model > 0 && choice_model < 6) {
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setVolum_L(new_variable);
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setOutput();

					meu_experimento_prototipo
							.getMy_prototype()
							.getThe_air_inside_the_prototype()
							.setPressure_kPa(
									meu_experimento_prototipo.getMy_prototype()
											.getModel_map().getOutput());
				}
				meu_experimento_prototipo.getMy_prototype()
						.getThe_air_inside_the_prototype()
						.setVolum_liters(new_variable);
			}

			// l�gica para a sexta op��o com os modelos fenomenol�gicos.
			else if (i == 6 && choice_model >= 2 && choice_model <= 5) {

				// declara��o e instancia��o de vari�vel.
				double new_variable = 0;

				// l�gica de obten��o de dados do dispositivo de entrada e
				// ajuste posterior dos objetos
				// relacionados com a massa molar do ar ambiente.
				for (boolean continuefor = true; continuefor;) {
					try {
						for (boolean continuetry = true; continuetry;) {

							this.vision
									.showMessage(this.vision
											.getMessage("enter_the_new_ambient_air_molar_mass_value"));
							new_variable = sc.nextDouble();

							if (new_variable <= 0) {
								this.vision
										.showMessage(this.vision
												.getMessage("you_must_enter_greater_than_equal_0"));
								throw new Exception_models();
							}
							if (new_variable > 0)
								continuetry = false;
						}
						continuefor = false;
					} catch (InputMismatchException inputMismatchException) {
						sc.nextLine();
						this.vision
								.showMessage(this.vision
										.getMessage("you_must_enter_with_only_a_comma"));
					} catch (Exception_models exc) {
						sc.nextLine();
					}
				}
				if (choice_model > 0 && choice_model < 6) {
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setMolar_mass_g_mol(new_variable);
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setOutput();
				}
				meu_experimento_prototipo.getAmbient_air()
						.setAir_molar_mass_g_mol(new_variable);

				if (choice_model > 0 && choice_model < 6)
					meu_experimento_prototipo
							.getMy_prototype()
							.getThe_air_inside_the_prototype()
							.setPressure_kPa(
									meu_experimento_prototipo.getMy_prototype()
											.getModel_map().getOutput());
				meu_experimento_prototipo.getMy_prototype()
						.getThe_air_inside_the_prototype()
						.setAir_molar_mass_g_mol(new_variable);
			}

			// l�gica para a s�tima op��o com os modelos fenomenol�gicos.
			else if (i == 7 && choice_model >= 2 && choice_model <= 5) {

				// declara��o e instancia��o de vari�vel.
				double new_variable = 0;

				// l�gica de obten��o de dados do dispositivo de entrada e
				// ajuste posterior dos objetos
				// relacionados com a temperatura do ar ambiente.
				for (boolean continuefor = true; continuefor;) {
					try {
						for (boolean continuetry = true; continuetry;) {

							this.vision
									.showMessage(this.vision
											.getMessage("enter_the_new_ambient_air_temperature_value"));
							new_variable = sc.nextDouble();

							if (new_variable <= 0) {
								this.vision
										.showMessage(this.vision
												.getMessage("you_must_enter_greater_than_equal_0"));
								throw new Exception_models();
							}
							if (new_variable > 0)
								continuetry = false;
						}
						continuefor = false;
					} catch (InputMismatchException inputMismatchException) {
						sc.nextLine();
						this.vision
								.showMessage(this.vision
										.getMessage("you_must_enter_with_only_a_comma"));
					} catch (Exception_models exc) {
						sc.nextLine();
					}
				}

				if (choice_model > 0 && choice_model < 6) {
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setTemperature_k(new_variable);
					meu_experimento_prototipo.getMy_prototype().getModel_map()
							.setOutput();
				}
				meu_experimento_prototipo.getAmbient_air()
						.setTemperature_kelvin(new_variable);

				if (choice_model > 0 && choice_model < 6)
					meu_experimento_prototipo
							.getMy_prototype()
							.getThe_air_inside_the_prototype()
							.setPressure_kPa(
									meu_experimento_prototipo.getMy_prototype()
											.getModel_map().getOutput());
				meu_experimento_prototipo.getMy_prototype()
						.getThe_air_inside_the_prototype()
						.setTemperature_kelvin(new_variable);
			}

			// l�gica para a mudan�a de modelos.
			else if ((i == 8 && choice_model >= 2 && choice_model <= 5)
					|| (i == 5 && choice_model < 2)) {

				// declara��o e instancia��o de vari�vel.
				int new_variable = 0;

				// l�gica de obten��o de dados do dispositivo de entrada e
				// mudan�a de modelos.
				for (boolean continuefor = true; continuefor;) {
					try {
						for (boolean continuetry = true; continuetry;) {

							this.vision.showMessage(this.vision
									.getMessage("enter_the_new_chosen_model"));
							new_variable = sc.nextInt();

							if (new_variable < 1 || new_variable > 5) {
								this.vision
										.showMessage(this.vision
												.getMessage("you_must_enter_between_1_and_5"));
								throw new Exception_models();
							}
							if (new_variable > 0 && new_variable < 6)
								continuetry = false;
						}
						continuefor = false;
					} catch (InputMismatchException inputMismatchException) {
						sc.nextLine();
						this.vision.showMessage(this.vision
								.getMessage("you_must_enter_a_whole_number"));
					} catch (Exception_models exc) {
						sc.nextLine();
					}
					choice_model = new_variable;
					meu_experimento_prototipo.getMy_prototype()
							.build_model_map(choice_model - 1);
					meu_experimento_prototipo.getMy_prototype()
							.build_model_maf(choice_model - 1);
					this.vision.setModelo_escolhido(this.vision
							.getMessage("model")
							+ choice_model
							+ " "
							+ this.vision.getMessage("was_chosen"));
					restart();
				}

			}
		}
	}

	public void start() {
		// chamada do m�todo reinicia().
		restart();

		execution();
	}
}