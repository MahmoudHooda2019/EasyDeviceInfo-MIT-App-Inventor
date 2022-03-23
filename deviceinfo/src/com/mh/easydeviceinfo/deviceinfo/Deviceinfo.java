package com.mh.easydeviceinfo.deviceinfo;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.util.YailList;
import github.nisrulz.easydeviceinfo.base.*;

import java.util.List;

public class Deviceinfo extends AndroidNonvisibleComponent {
  private Activity activity;
  private Context context;
  private EasyAppMod easyAppMod;
  private EasyBatteryMod easyBatteryMod;
//  private EasyBluetoothMod easyBluetoothMod;
  private EasyCpuMod easyCpuMod;
  private EasyDeviceMod easyDeviceMod;
  private EasyDisplayMod easyDisplayMod;
  private EasySimMod easySimMod;
//private EasyLocationMod easyLocationMod;
  private EasyNfcMod easyNfcMod;
  private EasyConfigMod easyconfigMod;
  private EasyIdMod easyIdMod;
  private EasySensorMod easySensorMod;
  private EasyFingerprintMod easyFingerprintMod;
  private EasyMemoryMod easyMemoryMod;
  private EasyNetworkMod easyNetworkMod;

  public Deviceinfo(ComponentContainer container) {
    super(container.$form());
    context = (Context) container.$context();
    activity = container.$context();
    easyAppMod = new EasyAppMod(context);
    easyBatteryMod = new EasyBatteryMod(context);
 // easyBluetoothMod = new EasyBluetoothMod(context);
    easyCpuMod = new EasyCpuMod();
    easyDeviceMod = new EasyDeviceMod(context);
    easyDisplayMod = new EasyDisplayMod(context);
    easySimMod = new EasySimMod(context);
//    easyLocationMod = new EasyLocationMod(context);
    easyNfcMod = new EasyNfcMod(context);
    easyconfigMod = new EasyConfigMod(context);
    easyIdMod = new EasyIdMod(context);
    easySensorMod = new EasySensorMod(context);
    List<Sensor> list = easySensorMod.getAllSensors();
// easyFingerprintMod = new EasyFingerprintMod(context);
    easyMemoryMod = new EasyMemoryMod(context);
    easyNetworkMod = new EasyNetworkMod(context);

  }
  ////////////////////////EasyNetworkMod\\\\\\\\\\\\\\\\\\\\\\\\\
  /*
  @SimpleFunction()
  public boolean isNetworkAvailable() {
    return easyNetworkMod.isNetworkAvailable();
  }

   */
  @SimpleFunction()
  public boolean isWifiEnabled() {
    return easyNetworkMod.isWifiEnabled();
  }
  @SimpleFunction()
  public String getIPv4Address() {
    return easyNetworkMod.getIPv4Address();
  }
  @SimpleFunction()
  public String getIPv6Address() {
    return easyNetworkMod.getIPv6Address();
  }
  /*
  @SimpleFunction()
  public String getWifiSSID() {
    return easyNetworkMod.getWifiSSID();
  }

   */
  /*
  @SimpleFunction()
  public String getWifiLinkSpeed() {
    return easyNetworkMod.getWifiLinkSpeed();
  }

   */
  /*
  @SimpleFunction()
  public String getWifiBSSID() {
    return easyNetworkMod.getWifiBSSID();
  }

   */
  /*
  @SimpleFunction()
  public String getWifiMAC() {
    return easyNetworkMod.getWifiMAC();
  }

   */
  /*
  @SimpleFunction()
  public int getNetworkType() {
    return easyNetworkMod.getNetworkType();
  }

   */


  ////////////////////////EasyMemoryMod\\\\\\\\\\\\\\\\\\\\\\\\\
  @SimpleFunction()
  public long getTotalRAM() {
    return easyMemoryMod.getTotalRAM();
  }
  @SimpleFunction()
  public long getAvailableInternalMemorySize() {
    return easyMemoryMod.getAvailableInternalMemorySize();
  }
  @SimpleFunction()
  public long getAvailableExternalMemorySize() {
    return easyMemoryMod.getAvailableExternalMemorySize();
  }
  @SimpleFunction()
  public long getTotalInternalMemorySize() {
    return easyMemoryMod.getTotalInternalMemorySize();
  }
  @SimpleFunction()
  public long getTotalExternalMemorySize() {
    return easyMemoryMod.getTotalExternalMemorySize();
  }
  @SimpleFunction()
  public float convertToKb(long valInBytes) {
    return easyMemoryMod.convertToKb(valInBytes);
  }
  @SimpleFunction()
  public float convertToMb(long valInBytes) {
    return easyMemoryMod.convertToMb(valInBytes);
  }
  @SimpleFunction()
  public float convertToGb(long valInBytes) {
    return easyMemoryMod.convertToGb(valInBytes);
  }
  @SimpleFunction()
  public float convertToTb(long valInBytes) {
    return easyMemoryMod.convertToTb(valInBytes);
  }


  ////////////////////////EasyFingerprintMod\\\\\\\\\\\\\\\\\\\\\\\\\
 /*
  @SimpleFunction()
  public boolean isFingerprintSensorPresent() {
    return easyFingerprintMod.isFingerprintSensorPresent();
  }
  */
  /*
  @SimpleFunction()
  public boolean isFingerprintSensorPresent() {
    return easyFingerprintMod.isFingerprintSensorPresent();
  }
*/
  ////////////////////////EasySensorMod\\\\\\\\\\\\\\\\\\\\\\\\\

  @SimpleFunction()
  public YailList getAllSensors() {
    return YailList.makeList(this.easySensorMod.getAllSensors());
  }
/*
  @SimpleFunction()
  public String getVersion() {
    return easySensorMod();
  }
  @SimpleFunction()
  public String getPseudoUniqueID() {
    return easySensorMod.getPseudoUniqueID();
  }
  @SimpleFunction()
  public String getPseudoUniqueID() {
    return easySensorMod.getPseudoUniqueID();
  }
  @SimpleFunction()
  public String getPseudoUniqueID() {
    return easySensorMod.getPseudoUniqueID();
  }
  @SimpleFunction()
  public String getPseudoUniqueID() {
    return easySensorMod.getPseudoUniqueID();
  }

*/
  ////////////////////////EasyIdMod\\\\\\\\\\\\\\\\\\\\\\\\\
  @SimpleFunction()
  public String getPseudoUniqueID() {
    return easyIdMod.getPseudoUniqueID();
  }
  @SimpleFunction()
  public String getAndroidID() {
    return easyIdMod.getAndroidID();
  }
  @SimpleFunction()
  public String getUA() {
    return easyIdMod.getUA();
  }
  /*
  @SimpleFunction()
  public String getGSFID() {
    return easyIdMod.getGSFID();
  }

   */
  /*
  @SimpleFunction()
  public String getEmailIds() {
    String[] emailIds = easyIdMod.getAccounts();
    StringBuilder emailString = new StringBuilder();
    if (emailIds != null && emailIds.length > 0) {
    for (String e : emailIds){
      emailString.append(e).append("\n");
    }
    } else {
      emailString.append("_");
    }
    return emailString.toString();
  }
/*


  ////////////////////////EasyconfigMod\\\\\\\\\\\\\\\\\\\\\\\\\
  @SimpleFunction()
  public boolean isRunningOnEmulator() {
    return easyconfigMod.isRunningOnEmulator();
  }
  @SimpleFunction()
  public long getTime() {
    return easyconfigMod.getTime();
  }
  @SimpleFunction()
  public String getFormattedTime() {
    return easyconfigMod.getFormattedTime();
  }
  @SimpleFunction()
  public long getUpTime() {
    return easyconfigMod.getUpTime();
  }
  @SimpleFunction()
  public String getFormattedUpTime() {
    return easyconfigMod.getFormattedUpTime();
  }
  @SimpleFunction()
  public Date getCurrentDate() {
    return easyconfigMod.getCurrentDate();
  }
  @SimpleFunction()
  public String getFormattedDate() {
    return easyconfigMod.getFormattedDate();
  }
  @SimpleFunction()
  public boolean hasSdCard() {
    return easyconfigMod.hasSdCard();
  }

  ////////////////////////EasyNfcMod\\\\\\\\\\\\\\\\\\\\\\\\\
  @SimpleFunction()
  public boolean isNfcPresent() {
    return easyNfcMod.isNfcPresent();
  }
  @SimpleFunction()
  public boolean isNfcEnabled() {
    return easyNfcMod.isNfcEnabled();
  }
  ////////////////////////EasyLocationMod\\\\\\\\\\\\\\\\\\\\\\\\\

  ////////////////////////EasySimMod\\\\\\\\\\\\\\\\\\\\\\\\\
  /*
  @SimpleFunction()

  public String getIMSI() {
    return easySimMod.getIMSI();
  }
 */
  /*
  @SimpleFunction()
  public String getSIMSerial() {
    return easySimMod.getSIMSerial();
  }

   */
  @SimpleFunction()
  public String getCountry() {
    return easySimMod.getCountry();
  }
  @SimpleFunction()
  public String getCarrier() {
    return easySimMod.getCarrier();
  }
  @SimpleFunction()
  public boolean isSimNetworkLocked() {
    return easySimMod.isSimNetworkLocked();
  }
  /*
  @SimpleFunction()
  public List getActiveMultiSimInfo() {
    return (List) easySimMod.getActiveMultiSimInfo();
  }

   */
  /*
  @SimpleFunction()
  public boolean isMultiSim() {
    return easySimMod.isMultiSim();
  }

   */
  /*
  @SimpleFunction()
  public int getNumberOfActiveSim() {
    return easySimMod.getNumberOfActiveSim();
  }

   */

  /////////////////////////EasyDisplayMod\\\\\\\\\\\\\\\\\\\\
  @SimpleFunction()
  public String getResolution() {
    return easyDisplayMod.getResolution();
  }
  @SimpleFunction()
  public String getDensity() {
    return easyDisplayMod.getDensity();
  }
  /*
  @SimpleFunction()
  public int[] getDisplayXYCoordinates(Event motionevent) {
    return easyDisplayMod.getDisplayXYCoordinates(motionevent);
  }
   */
  @SimpleFunction()
  public float getRefreshRate() {
    return easyDisplayMod.getRefreshRate();
  }
  /*
  @SimpleFunction()
  public String getDefaultOrientation() {
    return easyDisplayMod.getDefaultOrientation();
  }
   */
  @SimpleFunction()
  public float getPhysicalSize() {
    return easyDisplayMod.getPhysicalSize();
  }

  ///////////////////////////EasyDeviceMod\\\\\\\\\\\\\\\\\\\\\
  /*
  @SimpleFunction()
  public String getIMEI() {
    return easyDeviceMod.getIMEI();
  }
*/
  @SimpleFunction()
  public int getOrientation() {
    return easyDeviceMod.getOrientation(activity);
  }

  @SimpleFunction()
  public String getScreenDisplayID() {
    return easyDeviceMod.getScreenDisplayID();
  }
  @SimpleFunction()
  public String getBuildVersionCodename() {
    return easyDeviceMod.getBuildVersionCodename();
  }
  @SimpleFunction()
  public String getBuildVersionIncremental() {
    return easyDeviceMod.getBuildVersionIncremental();
  }
  @SimpleFunction()
  public int getBuildVersionSDK() {
    return easyDeviceMod.getBuildVersionSDK();
  }
  @SimpleFunction()
  public String getBuildID() {
    return easyDeviceMod.getBuildID();
  }
  @SimpleFunction()
  public String getManufacturer() {
    return easyDeviceMod.getManufacturer();
  }
  @SimpleFunction()
  public String getModel() {
    return easyDeviceMod.getModel();
  }
  @SimpleFunction()
  public String getOSCodename() {
    return easyDeviceMod.getOSCodename();
  }
  @SimpleFunction()
  public String getOSVersion() {
    return easyDeviceMod.getOSVersion();
  }
  /*
  @SimpleFunction()
  public String getPhoneNo() {
    return easyDeviceMod.getPhoneNo();
  }
   */
  @SimpleFunction()
  public String getRadioVer() {
    return easyDeviceMod.getRadioVer();
  }
  @SimpleFunction()
  public String getProduct() {
    return easyDeviceMod.getProduct();
  }
  @SimpleFunction()
  public String getDevice() {
    return easyDeviceMod.getDevice();
  }
  @SimpleFunction()
  public String getBoard() {
    return easyDeviceMod.getBoard();
  }
  @SimpleFunction()
  public String getHardware() {
    return easyDeviceMod.getHardware();
  }
  @SimpleFunction()
  public String getBootloader() {
    return easyDeviceMod.getBootloader();
  }
  @SimpleFunction()
  public String getFingerprint() {
    return easyDeviceMod.getFingerprint();
  }
  @SimpleFunction()
  public boolean isDeviceRooted() {
    return easyDeviceMod.isDeviceRooted();
  }
  @SimpleFunction()
  public String getBuildBrand() {
    return easyDeviceMod.getBuildBrand();
  }
  @SimpleFunction()
  public String getBuildHost() {
    return easyDeviceMod.getBuildHost();
  }
  @SimpleFunction()
  public String getBuildTags() {
    return easyDeviceMod.getBuildTags();
  }
  @SimpleFunction()
  public long getBuildTime() {
    return easyDeviceMod.getBuildTime();
  }
  @SimpleFunction()
  public String getBuildUser() {
    return easyDeviceMod.getBuildUser();
  }
  @SimpleFunction()
  public String getBuildVersionRelease() {
    return easyDeviceMod.getBuildVersionRelease();
  }

  ////////////////////////////EasyCpuMod\\\\\\\\\\\\\\\\\\\\\\

  @SimpleFunction()
  public String getStringSupportedABIS() {
    return easyCpuMod.getStringSupportedABIS();
  }
  @SimpleFunction()
  public String getStringSupported32bitABIS() {
    return easyCpuMod.getStringSupported32bitABIS();
  }
  @SimpleFunction()
  public String getStringSupported64bitABIS() {
    return easyCpuMod.getStringSupported64bitABIS();
  }

  ////////////////////////////EasyBluetoothMod\\\\\\\\\\\\\\\\\\\\\\
/*
  @SimpleFunction()
  public String getBluetoothMACAddress() {
    return easyBluetoothMod.getBluetoothMAC();
  }
*/

  /////////////////////////////EasyBatteryMod\\\\\\\\\\\\\\\\\\\\\\\
  @SimpleFunction()
  public int getBatteryPercentage() {
    return easyBatteryMod.getBatteryPercentage();
  }
  @SimpleFunction()
  public boolean isDeviceCharging() {
    return easyBatteryMod.isDeviceCharging();
  }
  @SimpleFunction()
  public String getBatteryTechnology() {
    return easyBatteryMod.getBatteryTechnology();
  }
  @SimpleFunction()
  public float getBatteryTemperature() {
    return easyBatteryMod.getBatteryTemperature();
  }
  @SimpleFunction()
  public int getBatteryVoltage() {
    return easyBatteryMod.getBatteryVoltage();
  }
  @SimpleFunction()
  public boolean isBatteryPresent() {
    return easyBatteryMod.isBatteryPresent();
  }


  /////////////////////////////EasyAppMod\\\\\\\\\\\\\\\\\
  @SimpleFunction()
  public String getActivityName() {
    return easyAppMod.getActivityName();
  }
  @SimpleFunction()
  public String getPackageName() {
    return easyAppMod.getPackageName();
  }
  @SimpleFunction()
  public String getStore() {
    return easyAppMod.getStore();
  }
  @SimpleFunction()
  public String getAppName() {
    return easyAppMod.getAppName();
  }
  @SimpleFunction()
  public String getAppVersion() {
    return easyAppMod.getAppVersion();
  }
  @SimpleFunction()
  public String getAppVersionCode() {
    return easyAppMod.getAppVersionCode();
  }
  @SimpleFunction()
  public boolean isAppInstalled(String packageName) {
    return easyAppMod.isAppInstalled(packageName);
  }
  @SimpleFunction()
  public boolean isPermissionGranted(String permission) {
    return easyAppMod.isPermissionGranted(permission);
  }

  /////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\




}
