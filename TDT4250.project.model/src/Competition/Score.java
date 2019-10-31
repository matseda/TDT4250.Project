/**
 */
package competition;

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
 *   <li>{@link competition.Score#getWinner <em>Winner</em>}</li>
 *   <li>{@link competition.Score#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link competition.Score#getAwayTeam <em>Away Team</em>}</li>
 *   <li>{@link competition.Score#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see competition.CompetitionPackage#getScore()
 * @model
 * @generated
 */
public interface Score extends EObject {
	/**
	 * Returns the value of the '<em><b>Winner</b></em>' attribute.
	 * The literals are from the enumeration {@link competition.Winner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' attribute.
	 * @see competition.Winner
	 * @see #setWinner(Winner)
	 * @see competition.CompetitionPackage#getScore_Winner()
	 * @model required="true"
	 * @generated
	 */
	Winner getWinner();

	/**
	 * Sets the value of the '{@link competition.Score#getWinner <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' attribute.
	 * @see competition.Winner
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
	 * @see competition.CompetitionPackage#getScore_HomeTeam()
	 * @model
	 * @generated
	 */
	int getHomeTeam();

	/**
	 * Sets the value of the '{@link competition.Score#getHomeTeam <em>Home Team</em>}' attribute.
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
	 * @see competition.CompetitionPackage#getScore_AwayTeam()
	 * @model
	 * @generated
	 */
	int getAwayTeam();

	/**
	 * Sets the value of the '{@link competition.Score#getAwayTeam <em>Away Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Team</em>' attribute.
	 * @see #getAwayTeam()
	 * @generated
	 */
	void setAwayTeam(int value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link competition.Match#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' container reference.
	 * @see #setMatch(Match)
	 * @see competition.CompetitionPackage#getScore_Match()
	 * @see competition.Match#getScore
	 * @model opposite="score" transient="false"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link competition.Score#getMatch <em>Match</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' container reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

} // Score
