/**
 */
package competition;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link competition.Match#getId <em>Id</em>}</li>
 *   <li>{@link competition.Match#getUtcDate <em>Utc Date</em>}</li>
 *   <li>{@link competition.Match#getStatus <em>Status</em>}</li>
 *   <li>{@link competition.Match#getMinute <em>Minute</em>}</li>
 *   <li>{@link competition.Match#getAttendance <em>Attendance</em>}</li>
 *   <li>{@link competition.Match#getVenue <em>Venue</em>}</li>
 *   <li>{@link competition.Match#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link competition.Match#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link competition.Match#getAwayTeam <em>Away Team</em>}</li>
 *   <li>{@link competition.Match#getScore <em>Score</em>}</li>
 *   <li>{@link competition.Match#getGoals <em>Goals</em>}</li>
 *   <li>{@link competition.Match#getBookings <em>Bookings</em>}</li>
 *   <li>{@link competition.Match#getSubstitutions <em>Substitutions</em>}</li>
 *   <li>{@link competition.Match#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @see competition.CompetitionPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see competition.CompetitionPackage#getMatch_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link competition.Match#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Utc Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utc Date</em>' attribute.
	 * @see #setUtcDate(Date)
	 * @see competition.CompetitionPackage#getMatch_UtcDate()
	 * @model required="true"
	 * @generated
	 */
	Date getUtcDate();

	/**
	 * Sets the value of the '{@link competition.Match#getUtcDate <em>Utc Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utc Date</em>' attribute.
	 * @see #getUtcDate()
	 * @generated
	 */
	void setUtcDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link competition.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see competition.Status
	 * @see #setStatus(Status)
	 * @see competition.CompetitionPackage#getMatch_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link competition.Match#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see competition.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see competition.CompetitionPackage#getMatch_Minute()
	 * @model
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link competition.Match#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

	/**
	 * Returns the value of the '<em><b>Attendance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendance</em>' attribute.
	 * @see #setAttendance(int)
	 * @see competition.CompetitionPackage#getMatch_Attendance()
	 * @model
	 * @generated
	 */
	int getAttendance();

	/**
	 * Sets the value of the '{@link competition.Match#getAttendance <em>Attendance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attendance</em>' attribute.
	 * @see #getAttendance()
	 * @generated
	 */
	void setAttendance(int value);

	/**
	 * Returns the value of the '<em><b>Venue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Venue</em>' attribute.
	 * @see #setVenue(String)
	 * @see competition.CompetitionPackage#getMatch_Venue()
	 * @model
	 * @generated
	 */
	String getVenue();

	/**
	 * Sets the value of the '{@link competition.Match#getVenue <em>Venue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Venue</em>' attribute.
	 * @see #getVenue()
	 * @generated
	 */
	void setVenue(String value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated</em>' attribute.
	 * @see #setLastUpdated(Date)
	 * @see competition.CompetitionPackage#getMatch_LastUpdated()
	 * @model
	 * @generated
	 */
	Date getLastUpdated();

	/**
	 * Sets the value of the '{@link competition.Match#getLastUpdated <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' attribute.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(Date value);

	/**
	 * Returns the value of the '<em><b>Home Team</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Team</em>' containment reference.
	 * @see #setHomeTeam(MatchTeam)
	 * @see competition.CompetitionPackage#getMatch_HomeTeam()
	 * @model containment="true"
	 * @generated
	 */
	MatchTeam getHomeTeam();

	/**
	 * Sets the value of the '{@link competition.Match#getHomeTeam <em>Home Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Team</em>' containment reference.
	 * @see #getHomeTeam()
	 * @generated
	 */
	void setHomeTeam(MatchTeam value);

	/**
	 * Returns the value of the '<em><b>Away Team</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Team</em>' containment reference.
	 * @see #setAwayTeam(MatchTeam)
	 * @see competition.CompetitionPackage#getMatch_AwayTeam()
	 * @model containment="true"
	 * @generated
	 */
	MatchTeam getAwayTeam();

	/**
	 * Sets the value of the '{@link competition.Match#getAwayTeam <em>Away Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Team</em>' containment reference.
	 * @see #getAwayTeam()
	 * @generated
	 */
	void setAwayTeam(MatchTeam value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link competition.Score#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Score)
	 * @see competition.CompetitionPackage#getMatch_Score()
	 * @see competition.Score#getMatch
	 * @model opposite="match" containment="true"
	 * @generated
	 */
	Score getScore();

	/**
	 * Sets the value of the '{@link competition.Match#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Score value);

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link competition.Goal}.
	 * It is bidirectional and its opposite is '{@link competition.Goal#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see competition.CompetitionPackage#getMatch_Goals()
	 * @see competition.Goal#getMatch
	 * @model opposite="match" containment="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' containment reference list.
	 * The list contents are of type {@link competition.Booking}.
	 * It is bidirectional and its opposite is '{@link competition.Booking#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' containment reference list.
	 * @see competition.CompetitionPackage#getMatch_Bookings()
	 * @see competition.Booking#getMatch
	 * @model opposite="match" containment="true"
	 * @generated
	 */
	EList<Booking> getBookings();

	/**
	 * Returns the value of the '<em><b>Substitutions</b></em>' containment reference list.
	 * The list contents are of type {@link competition.Substitution}.
	 * It is bidirectional and its opposite is '{@link competition.Substitution#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitutions</em>' containment reference list.
	 * @see competition.CompetitionPackage#getMatch_Substitutions()
	 * @see competition.Substitution#getMatch
	 * @model opposite="match" containment="true"
	 * @generated
	 */
	EList<Substitution> getSubstitutions();

	/**
	 * Returns the value of the '<em><b>Season</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link competition.Season#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' container reference.
	 * @see #setSeason(Season)
	 * @see competition.CompetitionPackage#getMatch_Season()
	 * @see competition.Season#getMatches
	 * @model opposite="matches" transient="false"
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link competition.Match#getSeason <em>Season</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' container reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

} // Match
