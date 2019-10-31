/**
 */
package competition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link competition.Goal#getMinute <em>Minute</em>}</li>
 *   <li>{@link competition.Goal#getExtraTime <em>Extra Time</em>}</li>
 *   <li>{@link competition.Goal#getMatch <em>Match</em>}</li>
 *   <li>{@link competition.Goal#getTeam <em>Team</em>}</li>
 *   <li>{@link competition.Goal#getScorer <em>Scorer</em>}</li>
 *   <li>{@link competition.Goal#getAssist <em>Assist</em>}</li>
 * </ul>
 *
 * @see competition.CompetitionPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends EObject {
	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see competition.CompetitionPackage#getGoal_Minute()
	 * @model required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link competition.Goal#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

	/**
	 * Returns the value of the '<em><b>Extra Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Time</em>' attribute.
	 * @see #setExtraTime(int)
	 * @see competition.CompetitionPackage#getGoal_ExtraTime()
	 * @model
	 * @generated
	 */
	int getExtraTime();

	/**
	 * Sets the value of the '{@link competition.Goal#getExtraTime <em>Extra Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Time</em>' attribute.
	 * @see #getExtraTime()
	 * @generated
	 */
	void setExtraTime(int value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link competition.Match#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' container reference.
	 * @see #setMatch(Match)
	 * @see competition.CompetitionPackage#getGoal_Match()
	 * @see competition.Match#getGoals
	 * @model opposite="goals" transient="false"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link competition.Goal#getMatch <em>Match</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' container reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see competition.CompetitionPackage#getGoal_Team()
	 * @model required="true"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link competition.Goal#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Scorer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scorer</em>' reference.
	 * @see #setScorer(Person)
	 * @see competition.CompetitionPackage#getGoal_Scorer()
	 * @model required="true"
	 * @generated
	 */
	Person getScorer();

	/**
	 * Sets the value of the '{@link competition.Goal#getScorer <em>Scorer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scorer</em>' reference.
	 * @see #getScorer()
	 * @generated
	 */
	void setScorer(Person value);

	/**
	 * Returns the value of the '<em><b>Assist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assist</em>' reference.
	 * @see #setAssist(Person)
	 * @see competition.CompetitionPackage#getGoal_Assist()
	 * @model
	 * @generated
	 */
	Person getAssist();

	/**
	 * Sets the value of the '{@link competition.Goal#getAssist <em>Assist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assist</em>' reference.
	 * @see #getAssist()
	 * @generated
	 */
	void setAssist(Person value);

} // Goal
