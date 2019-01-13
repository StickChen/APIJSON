/*Copyright ©2015 TommyLemon(https://github.com/TommyLemon)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package zuo.biao.apijson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**测试用Log
 * @modifier Lemon
 */
public class Log {

	private static final boolean DEBUG = true;
	private static final Logger logger = LoggerFactory.getLogger(Log.class);
	
	/**
	 * @param TAG
	 * @param msg
	 */
	public static void d(String TAG, String msg) {
		if (DEBUG) {
			logger.debug(TAG + ".DEBUG: " + msg);
		}
	}

	/**
	 * @param TAG
	 * @param msg
	 */
	public static void v(String TAG, String msg) {
		if (DEBUG) {
			logger.trace(TAG + ".VERBOSE: " + msg);
		}
	}

	/**
	 * @param TAG
	 * @param msg
	 */
	public static void i(String TAG, String msg) {
		if (DEBUG) {
			logger.debug(TAG + ".INFO: " + msg);
		}
	}
	/**
	 * @param TAG
	 * @param msg
	 */
	public static void ii(String TAG, String msg) {
		if (DEBUG) {
			logger.info(TAG + ".INFO: " + msg);
		}
	}

	/**
	 * @param TAG
	 * @param msg
	 */
	public static void e(String TAG, String msg) {
		if (DEBUG) {
			logger.error(TAG + ".ERROR: " + msg);
		}
	}

	/**
	 * @param TAG
	 * @param msg
	 */
	public static void w(String TAG, String msg) {
		if (DEBUG) {
			logger.warn(TAG + ".WARN: " + msg);
		}
	}

}
