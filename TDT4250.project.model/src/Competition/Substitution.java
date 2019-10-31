/**
 */
package competition;

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
 *   <li>{@link competition.Substitution#getMinute <em>Minute</em>}</li>
 *   <li>{@link competition.Substitution#getMatch <em>Match</em>}</li>
 *   <li>{@link competition.Substitution#getPlayerOut <em>Player Out</em>}</li>
 *   <li>{@link competition.Substitution#getPlayerIn <em>Player In</em>}</li>
 *   <li>{@link competition.Substitution#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see competition.CompetitionPackage#getSubstitution()
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
	 * @see competition.CompetitionPackage#getSubstitution_Minute()
	 * @model required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link competition.Substitution#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link competition.Match#getSubstitutions <em>Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' container reference.
	 * @see #setMatch(Match)
	 * @see competition.CompetitionPackage#getSubstitution_Match()
	 * @see competition.Match#getSubstitutions
	 * @model opposite="substitutions" transient="false"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link competition.Substitution#getMatch <em>Match</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' container reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

	/**
	 * Returns the value of the '<em><b>Player Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Out</em>' reference.
	 * @see #setPlayerOut(Person)
	 * @see competition.CompetitionPackage#getSubstitution_PlayerOut()
	 * @model required="true"
	 * @generated
	 */
	Person getPlayerOut();

	/**
	 * Sets the value of the '{@link competition.Substitution#getPlayerOut <em>Player Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Out</em>' reference.
	 * @see #getPlayerOut()
	 * @generated
	 */
	void setPlayerOut(Person value);

	/**
	 * Returns the value of the '<em><b>Player In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player In</em>' reference.
	 * @see #setPlayerIn(Person)
	 * @see competition.CompetitionPackage#getSubstitution_PlayerIn()
	 * @model required="true"
	 * @generated
	 */
	Person getPlayerIn();

	/**
	 * Sets the value of the '{@link competition.Substitution#getPlayerIn <em>Player In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player In</em>' reference.
	 * @see #getPlayerIn()
	 * @generated
	 */
	void setPlayerIn(Person value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see competition.CompetitionPackage#getSubstitution_Team()
	 * @model required="true"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link competition.Substitution#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

} // Substitution
