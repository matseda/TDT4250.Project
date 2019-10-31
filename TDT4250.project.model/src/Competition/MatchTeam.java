/**
 */
package competition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link competition.MatchTeam#getTeam <em>Team</em>}</li>
 *   <li>{@link competition.MatchTeam#getCoach <em>Coach</em>}</li>
 *   <li>{@link competition.MatchTeam#getCaptain <em>Captain</em>}</li>
 *   <li>{@link competition.MatchTeam#getLineup <em>Lineup</em>}</li>
 *   <li>{@link competition.MatchTeam#getBench <em>Bench</em>}</li>
 * </ul>
 *
 * @see competition.CompetitionPackage#getMatchTeam()
 * @model
 * @generated
 */
public interface MatchTeam extends EObject {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see competition.CompetitionPackage#getMatchTeam_Team()
	 * @model
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link competition.MatchTeam#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Coach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coach</em>' reference.
	 * @see #setCoach(Person)
	 * @see competition.CompetitionPackage#getMatchTeam_Coach()
	 * @model
	 * @generated
	 */
	Person getCoach();

	/**
	 * Sets the value of the '{@link competition.MatchTeam#getCoach <em>Coach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coach</em>' reference.
	 * @see #getCoach()
	 * @generated
	 */
	void setCoach(Person value);

	/**
	 * Returns the value of the '<em><b>Captain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captain</em>' reference.
	 * @see #setCaptain(Person)
	 * @see competition.CompetitionPackage#getMatchTeam_Captain()
	 * @model
	 * @generated
	 */
	Person getCaptain();

	/**
	 * Sets the value of the '{@link competition.MatchTeam#getCaptain <em>Captain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captain</em>' reference.
	 * @see #getCaptain()
	 * @generated
	 */
	void setCaptain(Person value);

	/**
	 * Returns the value of the '<em><b>Lineup</b></em>' reference list.
	 * The list contents are of type {@link competition.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineup</em>' reference list.
	 * @see competition.CompetitionPackage#getMatchTeam_Lineup()
	 * @model
	 * @generated
	 */
	EList<Person> getLineup();

	/**
	 * Returns the value of the '<em><b>Bench</b></em>' reference list.
	 * The list contents are of type {@link competition.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bench</em>' reference list.
	 * @see competition.CompetitionPackage#getMatchTeam_Bench()
	 * @model
	 * @generated
	 */
	EList<Person> getBench();

} // MatchTeam
