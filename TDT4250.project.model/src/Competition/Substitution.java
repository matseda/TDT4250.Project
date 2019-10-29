/**
 */
package Competition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Competition.Substitution#getMinute <em>Minute</em>}</li>
 *   <li>{@link Competition.Substitution#getTeam <em>Team</em>}</li>
 *   <li>{@link Competition.Substitution#getPlayerOut <em>Player Out</em>}</li>
 *   <li>{@link Competition.Substitution#getPlayerIn <em>Player In</em>}</li>
 *   <li>{@link Competition.Substitution#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see Competition.CompetitionPackage#getSubstitution()
 * @model
 * @generated
 */
public interface Substitution extends EObject {
	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see Competition.CompetitionPackage#getSubstitution_Minute()
	 * @model required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link Competition.Substitution#getMinute <em>Minute</em>}' attribute.
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
	 * @see Competition.CompetitionPackage#getSubstitution_Team()
	 * @model required="true"
	 * @generated
	 */
	String getTeam();

	/**
	 * Sets the value of the '{@link Competition.Substitution#getTeam <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' attribute.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(String value);

	/**
	 * Returns the value of the '<em><b>Player Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Out</em>' attribute.
	 * @see #setPlayerOut(String)
	 * @see Competition.CompetitionPackage#getSubstitution_PlayerOut()
	 * @model required="true"
	 * @generated
	 */
	String getPlayerOut();

	/**
	 * Sets the value of the '{@link Competition.Substitution#getPlayerOut <em>Player Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Out</em>' attribute.
	 * @see #getPlayerOut()
	 * @generated
	 */
	void setPlayerOut(String value);

	/**
	 * Returns the value of the '<em><b>Player In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player In</em>' attribute.
	 * @see #setPlayerIn(String)
	 * @see Competition.CompetitionPackage#getSubstitution_PlayerIn()
	 * @model required="true"
	 * @generated
	 */
	String getPlayerIn();

	/**
	 * Sets the value of the '{@link Competition.Substitution#getPlayerIn <em>Player In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player In</em>' attribute.
	 * @see #getPlayerIn()
	 * @generated
	 */
	void setPlayerIn(String value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Competition.Match#getSubstitutions <em>Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' container reference.
	 * @see #setMatch(Match)
	 * @see Competition.CompetitionPackage#getSubstitution_Match()
	 * @see Competition.Match#getSubstitutions
	 * @model opposite="substitutions" transient="false"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link Competition.Substitution#getMatch <em>Match</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' container reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

} // Substitution
