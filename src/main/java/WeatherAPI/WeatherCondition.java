//	Copyright 2012 John Luetke
//
//	Licensed under the Apache License, Version 2.0 (the "License");
//	you may not use this file except in compliance with the License.
//	You may obtain a copy of the License at
//
//		http://www.apache.org/licenses/LICENSE-2.0
//
//	Unless required by applicable law or agreed to in writing, software
//	distributed under the License is distributed on an "AS IS" BASIS,
//	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//	See the License for the specific language governing permissions and
//	limitations under the License.

package WeatherAPI;
	
/**
 * Represents different weather conditions. These can be OR'd together to create complex conditions.
 */
public enum WeatherCondition {
	Overcast,
	Cloudy,
	PartlyCloudy,
	Clear,
	
	Patchy,
	Light,
	Moderate,
	Heavy,
	Torrential,
	
	Fog,
	Mist,
	Drizzle,
	Rain,
	Sleet,
	Snow,
	Ice,
	Blizzard,
	
	Pellets,
	Showers,
	Freezing,
	
	Blowing,
	
	Thunder
}
