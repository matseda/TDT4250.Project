/**
 */
package Competition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Competition.Score#getWinner <em>Winner</em>}</li>
 *   <li>{@link Competition.Score#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link Competition.Score#getAwayTeam <em>Away Team</em>}</li>
 *   <li>{@link Competition.Score#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see Competition.CompetitionPackage#getScore()
 * @model
 * @generated
 */
public interface Score extends EObject {
	/**
	 * Returns the value of the '<em><b>Winner</b></em>' attribute.
	 * The literals are from the enumeration {@link Competition.Winner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' attribute.
	 * @see Competition.Winner
	 * @see #setWinner(Winner)
	 * @see Competition.CompetitionPackage#getScore_Winner()
	 * @model required="true"
	 * @generated
	 */
	Winner getWinner();

	/**
	 * Sets the value of the '{@link Competition.Score#getWinner <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' attribute.
	 * @see Competition.Winner
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(Winner value);

	/**
	 * Returns the value of the '<em><b>Home Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Team</em>' attribute.
	 * @see #setHomeTeam(int)
	 * @see Competition.CompetitionPackage#getScore_HomeTeam()
	 * @model
	 * @generated
	 */
	int getHomeTeam();

	/**
	 * Sets the value of the '{@link Competition.Score#getHomeTeam <em>Home Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Team</em>' attribute.
	 * @see #getHomeTeam()
	 * @generated
	 */
	void setHomeTeam(int value);

	/**
	 * Returns the value of the '<em><b>Away Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Team</em>' attribute.
	 * @see #setAwayTeam(int)
	 * @see Competition.CompetitionPackage#getScore_AwayTeam()
	 * @model
	 * @generated
	 */
	int getAwayTeam();

	/**
	 * Sets the value of the '{@link Competition.Score#getAwayTeam <em>Away Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Team</em>' attribute.
	 * @see #getAwayTeam()
	 * @generated
	 */
	void setAwayTeam(int value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Competition.Match#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' container reference.
	 * @see #setMatch(Match)
	 * @see Competition.CompetitionPackage#getScore_Match()
	 * @see Competition.Match#getScore
	 * @model opposite="score" transient="false"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link Competition.Score#getMatch <em>Match</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' container reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

} // Score
