
package hla.rti;

/**
 * Public exception class EnableTimeRegulationPending
*/

public final class EnableTimeRegulationPending extends RTIexception {

  /**
   * @param reason    String to be carried with exception
   */
  public EnableTimeRegulationPending(String reason) {
	super(reason, 0);
  }  

  /**
   * @param serial    serial number also printed with the exception
   */
  public EnableTimeRegulationPending(String reason, int serial) {
	super(reason, serial);
  }  
}