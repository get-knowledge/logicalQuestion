package com.gobeyond.question.design.pattern;

public class AbstractFactory {

	static DeviceFactory getFactory(FactoryType factoryType) {

		switch (factoryType) {
		case MOBILE: {

		}
		case LAPTOP: {

		}
		}
		return null;
	}

}

abstract class Device {

	public abstract String getDetails();

}

abstract class DeviceFactory {

	abstract Device getGadget(DeviceType deviceType);
}

enum DeviceType {

	DELL, HP, NOKIA, SAMSUNG

}

class LaptopFactory extends DeviceFactory {

	@Override
	Device getGadget(DeviceType deviceType) {

		switch (deviceType) {

		case HP: {

			return new HP("8GB", "INTEL", "Nvidia");
		}

		case DELL: {

			return new DELL("16GB", "INTEL", "Nvidia");
		}
		default:
			break;

		}
		return null;

	}

}

class MobileFactroy extends DeviceFactory {

	@Override
	Device getGadget(DeviceType deviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	class DELL extends Device {

		private String ram;
		private String processor;
		private String gpu;

		@Override
		public String getDetails() {
			return "Dell config is ram size" + this.ram + " and processor type is " + this.processor + " adn GPU "
					+ this.gpu;
		}

		@Override
		public String toString() {
			return "DELL [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
		}
	}

	class HP extends Device {

		private String ram;
		private String processor;
		private String gpu;

		@Override
		public String getDetails() {
			return "HP config is ram size" + this.ram + " and processor type is " + this.processor + " adn GPU "
					+ this.gpu;
		}

		@Override
		public String toString() {
			return "HP [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
		}

	}

	class NOKIA extends Device {

		private String ram;
		private String processor;

		@Override
		public String getDetails() {
			return "HP config is ram size" + this.ram + " and processor type is " + this.processor;
		}

		@Override
		public String toString() {
			return "HP [ram=" + ram + ", processor=" + processor + "]";
		}

	}

	class SAMSUNG extends Device {

		private String ram;
		private String processor;

		@Override
		public String getDetails() {
			return "SAMSUNG config is ram size" + this.ram + " and processor type is " + this.processor;
		}

		@Override
		public String toString() {
			return "SAMSUNG [ram=" + ram + ", processor=" + processor + "]";
		}

	}

}
