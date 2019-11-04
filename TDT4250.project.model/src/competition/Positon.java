/**
 */
package competition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link competition.Positon#getPosition <em>Position</em>}</li>
 *   <li>{@link competition.Positon#getTeam <em>Team</em>}</li>
 *   <li>{@link competition.Positon#getPlayedGames <em>Played Games</em>}</li>
 *   <li>{@link competition.Positon#getWon <em>Won</em>}</li>
 *   <li>{@link competition.Positon#getDraw <em>Draw</em>}</li>
 *   <li>{@link competition.Positon#getLost <em>Lost</em>}</li>
 *   <li>{@link competition.Positon#getPoints <em>Points</em>}</li>
 *   <li>{@link competition.Positon#getGoalsFor <em>Goals For</em>}</li>
 *   <li>{@link competition.Positon#getGoalsAgaints <em>Goals Againts</em>}</li>
 *   <li>{@link competition.Positon#getGoalDifference <em>Goal Difference</em>}</li>
 * </ul>
 *
 * @see competition.CompetitionPackage#getPositon()
 * @model
 * @generated
 */
public interface Positon extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see competition.CompetitionPackage#getPositon_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link competition.Positon#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see competition.CompetitionPackage#getPositon_Team()
	 * @model
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link competition.Positon#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Played Games</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Played Games</em>' attribute.
	 * @see #setPlayedGames(int)
	 * @see competition.CompetitionPackage#getPositon_PlayedGames()
	 * @model
	 * @generated
	 */
	int getPlayedGames();

	/**
	 * Sets the value of the '{@link competition.Positon#getPlayedGames <em>Played Games</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Played Games</em>' attribute.
	 * @see #getPlayedGames()
	 * @generated
	 */
	void setPlayedGames(int value);

	/**
	 * Returns the value of the '<em><b>Won</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Won</em>' attribute.
	 * @see #setWon(int)
	 * @see competition.CompetitionPackage#getPositon_Won()
	 * @model
	 * @generated
	 */
	int getWon();

	/**
	 * Sets the value of the '{@link competition.Positon#getWon <em>Won</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Won</em>' attribute.
	 * @see #getWon()
	 * @generated
	 */
	void setWon(int value);

	/**
	 * Returns the value of the '<em><b>Draw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draw</em>' attribute.
	 * @see #setDraw(int)
	 * @see competition.CompetitionPackage#getPositon_Draw()
	 * @model
	 * @generated
	 */
	int getDraw();

	/**
	 * Sets the value of the '{@link competition.Positon#getDraw <em>Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draw</em>' attribute.
	 * @see #getDraw()
	 * @generated
	 */
	void setDraw(int value);

	/**
	 * Returns the value of the '<em><b>Lost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lost</em>' attribute.
	 * @see #setLost(int)
	 * @see competition.CompetitionPackage#getPositon_Lost()
	 * @model
	 * @generated
	 */
	int getLost();

	/**
	 * Sets the value of the '{@link competition.Positon#getLost <em>Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lost</em>' attribute.
	 * @see #getLost()
	 * @generated
	 */
	void setLost(int value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see competition.CompetitionPackage#getPositon_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link competition.Positon#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Goals For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals For</em>' attribute.
	 * @see #setGoalsFor(int)
	 * @see competition.CompetitionPackage#getPositon_GoalsFor()
	 * @model
	 * @generated
	 */
	int getGoalsFor();

	/**
	 * Sets the value of the '{@link competition.Positon#getGoalsFor <em>Goals For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals For</em>' attribute.
	 * @see #getGoalsFor()
	 * @generated
	 */
	void setGoalsFor(int value);

	/**
	 * Returns the value of the '<em><b>Goals Againts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals Againts</em>' attribute.
	 * @see #setGoalsAgaints(int)
	 * @see competition.CompetitionPackage#getPositon_GoalsAgaints()
	 * @model
	 * @generated
	 */
	int getGoalsAgaints();

	/**
	 * Sets the value of the '{@link competition.Positon#getGoalsAgaints <em>Goals Againts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals Againts</em>' attribute.
	 * @see #getGoalsAgaints()
	 * @generated
	 */
	void setGoalsAgaints(int value);

	/**
	 * Returns the value of the '<em><b>Goal Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Difference</em>' attribute.
	 * @see #setGoalDifference(int)
	 * @see competition.CompetitionPackage#getPositon_GoalDifference()
	 * @model
	 * @generated
	 */
	int getGoalDifference();

	/**
	 * Sets the value of the '{@link competition.Positon#getGoalDifference <em>Goal Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Difference</em>' attribute.
	 * @see #getGoalDifference()
	 * @generated
	 */
	void setGoalDifference(int value);

} // Positon
