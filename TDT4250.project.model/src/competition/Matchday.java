/**
 */
package competition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matchday</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link competition.Matchday#getMatchday <em>Matchday</em>}</li>
 *   <li>{@link competition.Matchday#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @see competition.CompetitionPackage#getMatchday()
 * @model
 * @generated
 */
public interface Matchday extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchday</em>' attribute.
	 * @see #setMatchday(int)
	 * @see competition.CompetitionPackage#getMatchday_Matchday()
	 * @model
	 * @generated
	 */
	int getMatchday();

	/**
	 * Sets the value of the '{@link competition.Matchday#getMatchday <em>Matchday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchday</em>' attribute.
	 * @see #getMatchday()
	 * @generated
	 */
	void setMatchday(int value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link competition.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see competition.CompetitionPackage#getMatchday_Matches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatches();

} // Matchday
