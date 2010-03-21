
package hla.rti;

/**
 * Public exception class ObjectNotKnown
*/

public final class ObjectNotKnown extends RTIexception {

  /**
   * @param reason    String to be carried with exception
   */
  public ObjectNotKnown(String reason) {
	super(reason, 0);
  }  

  /**
   * @param serial    serial number also printed with the exception
   */
  public ObjectNotKnown(String reason, int serial) {
	super(reason, serial);
  }  
}