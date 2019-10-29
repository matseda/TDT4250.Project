/**
 */
package Competition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Competition.Booking#getMinute <em>Minute</em>}</li>
 *   <li>{@link Competition.Booking#getTeam <em>Team</em>}</li>
 *   <li>{@link Competition.Booking#getPlayer <em>Player</em>}</li>
 *   <li>{@link Competition.Booking#getCard <em>Card</em>}</li>
 *   <li>{@link Competition.Booking#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see Competition.CompetitionPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see Competition.CompetitionPackage#getBooking_Minute()
	 * @model required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link Competition.Booking#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' attribute.
	 * @see #setTeam(String)
	 * @see Competition.CompetitionPackage#getBooking_Team()
	 * @model required="true"
	 * @generated
	 */
	String getTeam();

	/**
	 * Sets the value of the '{@link Competition.Booking#getTeam <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' attribute.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(String value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' attribute.
	 * @see #setPlayer(String)
	 * @see Competition.CompetitionPackage#getBooking_Player()
	 * @model required="true"
	 * @generated
	 */
	String getPlayer();

	/**
	 * Sets the value of the '{@link Competition.Booking#getPlayer <em>Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' attribute.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(String value);

	/**
	 * Returns the value of the '<em><b>Card</b></em>' attribute.
	 * The literals are from the enumeration {@link Competition.Card}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' attribute.
	 * @see Competition.Card
	 * @see #setCard(Card)
	 * @see Competition.CompetitionPackage#getBooking_Card()
	 * @model required="true"
	 * @generated
	 */
	Card getCard();

	/**
	 * Sets the value of the '{@link Competition.Booking#getCard <em>Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' attribute.
	 * @see Competition.Card
	 * @see #getCard()
	 * @generated
	 */
	void setCard(Card value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Competition.Match#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' container reference.
	 * @see #setMatch(Match)
	 * @see Competition.CompetitionPackage#getBooking_Match()
	 * @see Competition.Match#getBookings
	 * @model opposite="bookings" transient="false"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link Competition.Booking#getMatch <em>Match</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' container reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

} // Booking
