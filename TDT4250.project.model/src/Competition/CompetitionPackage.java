/**
 */
package competition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see competition.CompetitionFactory
 * @model kind="package"
 * @generated
 */
public interface CompetitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "competition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/TDT4250.project.mpdel/model/Competition.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "competition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompetitionPackage eINSTANCE = competition.impl.CompetitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link competition.impl.CompetitionImpl <em>Competition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.CompetitionImpl
	 * @see competition.impl.CompetitionPackageImpl#getCompetition()
	 * @generated
	 */
	int COMPETITION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__CODE = 2;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__PLAN = 3;

	/**
	 * The feature id for the '<em><b>Current Season</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__CURRENT_SEASON = 4;

	/**
	 * The feature id for the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__LAST_UPDATED = 5;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__TEAMS = 6;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__AREA = 7;

	/**
	 * The number of structural features of the '<em>Competition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Competition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.SeasonImpl <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.SeasonImpl
	 * @see competition.impl.CompetitionPackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Current Matchday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__CURRENT_MATCHDAY = 3;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__MATCHES = 4;

	/**
	 * The feature id for the '<em><b>Competition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__COMPETITION = 5;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.TeamImpl
	 * @see competition.impl.CompetitionPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Tla</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__TLA = 3;

	/**
	 * The feature id for the '<em><b>Founded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__FOUNDED = 4;

	/**
	 * The feature id for the '<em><b>Club Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CLUB_COLORS = 5;

	/**
	 * The feature id for the '<em><b>Squad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SQUAD = 6;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.PersonImpl
	 * @see competition.impl.CompetitionPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__POSITION = 2;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATE_OF_BIRTH = 3;

	/**
	 * The feature id for the '<em><b>Nationality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NATIONALITY = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLE = 5;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.MatchImpl
	 * @see competition.impl.CompetitionPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ID = 0;

	/**
	 * The feature id for the '<em><b>Utc Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__UTC_DATE = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__MINUTE = 3;

	/**
	 * The feature id for the '<em><b>Attendance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ATTENDANCE = 4;

	/**
	 * The feature id for the '<em><b>Venue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__VENUE = 5;

	/**
	 * The feature id for the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__LAST_UPDATED = 6;

	/**
	 * The feature id for the '<em><b>Home Team</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_TEAM = 7;

	/**
	 * The feature id for the '<em><b>Away Team</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_TEAM = 8;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SCORE = 9;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__GOALS = 10;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__BOOKINGS = 11;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SUBSTITUTIONS = 12;

	/**
	 * The feature id for the '<em><b>Season</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SEASON = 13;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.MatchTeamImpl <em>Match Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.MatchTeamImpl
	 * @see competition.impl.CompetitionPackageImpl#getMatchTeam()
	 * @generated
	 */
	int MATCH_TEAM = 5;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TEAM__TEAM = 0;

	/**
	 * The feature id for the '<em><b>Coach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TEAM__COACH = 1;

	/**
	 * The feature id for the '<em><b>Captain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TEAM__CAPTAIN = 2;

	/**
	 * The feature id for the '<em><b>Lineup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TEAM__LINEUP = 3;

	/**
	 * The feature id for the '<em><b>Bench</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TEAM__BENCH = 4;

	/**
	 * The number of structural features of the '<em>Match Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TEAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Match Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.ScoreImpl <em>Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.ScoreImpl
	 * @see competition.impl.CompetitionPackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 6;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__WINNER = 0;

	/**
	 * The feature id for the '<em><b>Home Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__HOME_TEAM = 1;

	/**
	 * The feature id for the '<em><b>Away Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__AWAY_TEAM = 2;

	/**
	 * The feature id for the '<em><b>Match</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__MATCH = 3;

	/**
	 * The number of structural features of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.GoalImpl
	 * @see competition.impl.CompetitionPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 7;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__MINUTE = 0;

	/**
	 * The feature id for the '<em><b>Extra Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__EXTRA_TIME = 1;

	/**
	 * The feature id for the '<em><b>Match</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__MATCH = 2;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TEAM = 3;

	/**
	 * The feature id for the '<em><b>Scorer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SCORER = 4;

	/**
	 * The feature id for the '<em><b>Assist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSIST = 5;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.BookingImpl
	 * @see competition.impl.CompetitionPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 8;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__MINUTE = 0;

	/**
	 * The feature id for the '<em><b>Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CARD = 1;

	/**
	 * The feature id for the '<em><b>Match</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__MATCH = 2;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__TEAM = 3;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PLAYER = 4;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.SubstitutionImpl <em>Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.SubstitutionImpl
	 * @see competition.impl.CompetitionPackageImpl#getSubstitution()
	 * @generated
	 */
	int SUBSTITUTION = 9;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__MINUTE = 0;

	/**
	 * The feature id for the '<em><b>Match</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__MATCH = 1;

	/**
	 * The feature id for the '<em><b>Player Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__PLAYER_OUT = 2;

	/**
	 * The feature id for the '<em><b>Player In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__PLAYER_IN = 3;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__TEAM = 4;

	/**
	 * The number of structural features of the '<em>Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.Role
	 * @see competition.impl.CompetitionPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 10;

	/**
	 * The meta object id for the '{@link competition.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.Status
	 * @see competition.impl.CompetitionPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 11;

	/**
	 * The meta object id for the '{@link competition.Winner <em>Winner</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.Winner
	 * @see competition.impl.CompetitionPackageImpl#getWinner()
	 * @generated
	 */
	int WINNER = 12;

	/**
	 * The meta object id for the '{@link competition.Card <em>Card</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.Card
	 * @see competition.impl.CompetitionPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 13;


	/**
	 * Returns the meta object for class '{@link competition.Competition <em>Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Competition</em>'.
	 * @see competition.Competition
	 * @generated
	 */
	EClass getCompetition();

	/**
	 * Returns the meta object for the attribute '{@link competition.Competition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see competition.Competition#getId()
	 * @see #getCompetition()
	 * @generated
	 */
	EAttribute getCompetition_Id();

	/**
	 * Returns the meta object for the attribute '{@link competition.Competition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see competition.Competition#getName()
	 * @see #getCompetition()
	 * @generated
	 */
	EAttribute getCompetition_Name();

	/**
	 * Returns the meta object for the attribute '{@link competition.Competition#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see competition.Competition#getCode()
	 * @see #getCompetition()
	 * @generated
	 */
	EAttribute getCompetition_Code();

	/**
	 * Returns the meta object for the attribute '{@link competition.Competition#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan</em>'.
	 * @see competition.Competition#getPlan()
	 * @see #getCompetition()
	 * @generated
	 */
	EAttribute getCompetition_Plan();

	/**
	 * Returns the meta object for the containment reference '{@link competition.Competition#getCurrentSeason <em>Current Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Season</em>'.
	 * @see competition.Competition#getCurrentSeason()
	 * @see #getCompetition()
	 * @generated
	 */
	EReference getCompetition_CurrentSeason();

	/**
	 * Returns the meta object for the attribute '{@link competition.Competition#getLastUpdated <em>Last Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Updated</em>'.
	 * @see competition.Competition#getLastUpdated()
	 * @see #getCompetition()
	 * @generated
	 */
	EAttribute getCompetition_LastUpdated();

	/**
	 * Returns the meta object for the containment reference list '{@link competition.Competition#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see competition.Competition#getTeams()
	 * @see #getCompetition()
	 * @generated
	 */
	EReference getCompetition_Teams();

	/**
	 * Returns the meta object for the attribute '{@link competition.Competition#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see competition.Competition#getArea()
	 * @see #getCompetition()
	 * @generated
	 */
	EAttribute getCompetition_Area();

	/**
	 * Returns the meta object for class '{@link competition.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see competition.Season
	 * @generated
	 */
	EClass getSeason();

	/**
	 * Returns the meta object for the attribute '{@link competition.Season#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see competition.Season#getId()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_Id();

	/**
	 * Returns the meta object for the attribute '{@link competition.Season#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see competition.Season#getStartDate()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link competition.Season#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see competition.Season#getEndDate()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link competition.Season#getCurrentMatchday <em>Current Matchday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Matchday</em>'.
	 * @see competition.Season#getCurrentMatchday()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_CurrentMatchday();

	/**
	 * Returns the meta object for the containment reference list '{@link competition.Season#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see competition.Season#getMatches()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Matches();

	/**
	 * Returns the meta object for the container reference '{@link competition.Season#getCompetition <em>Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Competition</em>'.
	 * @see competition.Season#getCompetition()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Competition();

	/**
	 * Returns the meta object for class '{@link competition.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see competition.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link competition.Team#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see competition.Team#getId()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Id();

	/**
	 * Returns the meta object for the attribute '{@link competition.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see competition.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the attribute '{@link competition.Team#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see competition.Team#getShortName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link competition.Team#getTla <em>Tla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tla</em>'.
	 * @see competition.Team#getTla()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Tla();

	/**
	 * Returns the meta object for the attribute '{@link competition.Team#getFounded <em>Founded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Founded</em>'.
	 * @see competition.Team#getFounded()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Founded();

	/**
	 * Returns the meta object for the attribute '{@link competition.Team#getClubColors <em>Club Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Club Colors</em>'.
	 * @see competition.Team#getClubColors()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_ClubColors();

	/**
	 * Returns the meta object for the containment reference list '{@link competition.Team#getSquad <em>Squad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Squad</em>'.
	 * @see competition.Team#getSquad()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Squad();

	/**
	 * Returns the meta object for class '{@link competition.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see competition.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link competition.Person#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see competition.Person#getId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Id();

	/**
	 * Returns the meta object for the attribute '{@link competition.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see competition.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link competition.Person#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see competition.Person#getPosition()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Position();

	/**
	 * Returns the meta object for the attribute '{@link competition.Person#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see competition.Person#getDateOfBirth()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DateOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link competition.Person#getNationality <em>Nationality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nationality</em>'.
	 * @see competition.Person#getNationality()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Nationality();

	/**
	 * Returns the meta object for the attribute '{@link competition.Person#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see competition.Person#getRole()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Role();

	/**
	 * Returns the meta object for class '{@link competition.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see competition.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link competition.Match#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see competition.Match#getId()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Id();

	/**
	 * Returns the meta object for the attribute '{@link competition.Match#getUtcDate <em>Utc Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utc Date</em>'.
	 * @see competition.Match#getUtcDate()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_UtcDate();

	/**
	 * Returns the meta object for the attribute '{@link competition.Match#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see competition.Match#getStatus()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Status();

	/**
	 * Returns the meta object for the attribute '{@link competition.Match#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see competition.Match#getMinute()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Minute();

	/**
	 * Returns the meta object for the attribute '{@link competition.Match#getAttendance <em>Attendance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attendance</em>'.
	 * @see competition.Match#getAttendance()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Attendance();

	/**
	 * Returns the meta object for the attribute '{@link competition.Match#getVenue <em>Venue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Venue</em>'.
	 * @see competition.Match#getVenue()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Venue();

	/**
	 * Returns the meta object for the attribute '{@link competition.Match#getLastUpdated <em>Last Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Updated</em>'.
	 * @see competition.Match#getLastUpdated()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_LastUpdated();

	/**
	 * Returns the meta object for the containment reference '{@link competition.Match#getHomeTeam <em>Home Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home Team</em>'.
	 * @see competition.Match#getHomeTeam()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_HomeTeam();

	/**
	 * Returns the meta object for the containment reference '{@link competition.Match#getAwayTeam <em>Away Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Away Team</em>'.
	 * @see competition.Match#getAwayTeam()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_AwayTeam();

	/**
	 * Returns the meta object for the containment reference '{@link competition.Match#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Score</em>'.
	 * @see competition.Match#getScore()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Score();

	/**
	 * Returns the meta object for the containment reference list '{@link competition.Match#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see competition.Match#getGoals()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link competition.Match#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bookings</em>'.
	 * @see competition.Match#getBookings()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Bookings();

	/**
	 * Returns the meta object for the containment reference list '{@link competition.Match#getSubstitutions <em>Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substitutions</em>'.
	 * @see competition.Match#getSubstitutions()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Substitutions();

	/**
	 * Returns the meta object for the container reference '{@link competition.Match#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Season</em>'.
	 * @see competition.Match#getSeason()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Season();

	/**
	 * Returns the meta object for class '{@link competition.MatchTeam <em>Match Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Team</em>'.
	 * @see competition.MatchTeam
	 * @generated
	 */
	EClass getMatchTeam();

	/**
	 * Returns the meta object for the reference '{@link competition.MatchTeam#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see competition.MatchTeam#getTeam()
	 * @see #getMatchTeam()
	 * @generated
	 */
	EReference getMatchTeam_Team();

	/**
	 * Returns the meta object for the reference '{@link competition.MatchTeam#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coach</em>'.
	 * @see competition.MatchTeam#getCoach()
	 * @see #getMatchTeam()
	 * @generated
	 */
	EReference getMatchTeam_Coach();

	/**
	 * Returns the meta object for the reference '{@link competition.MatchTeam#getCaptain <em>Captain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Captain</em>'.
	 * @see competition.MatchTeam#getCaptain()
	 * @see #getMatchTeam()
	 * @generated
	 */
	EReference getMatchTeam_Captain();

	/**
	 * Returns the meta object for the reference list '{@link competition.MatchTeam#getLineup <em>Lineup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lineup</em>'.
	 * @see competition.MatchTeam#getLineup()
	 * @see #getMatchTeam()
	 * @generated
	 */
	EReference getMatchTeam_Lineup();

	/**
	 * Returns the meta object for the reference list '{@link competition.MatchTeam#getBench <em>Bench</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bench</em>'.
	 * @see competition.MatchTeam#getBench()
	 * @see #getMatchTeam()
	 * @generated
	 */
	EReference getMatchTeam_Bench();

	/**
	 * Returns the meta object for class '{@link competition.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score</em>'.
	 * @see competition.Score
	 * @generated
	 */
	EClass getScore();

	/**
	 * Returns the meta object for the attribute '{@link competition.Score#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winner</em>'.
	 * @see competition.Score#getWinner()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Winner();

	/**
	 * Returns the meta object for the attribute '{@link competition.Score#getHomeTeam <em>Home Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Team</em>'.
	 * @see competition.Score#getHomeTeam()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_HomeTeam();

	/**
	 * Returns the meta object for the attribute '{@link competition.Score#getAwayTeam <em>Away Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away Team</em>'.
	 * @see competition.Score#getAwayTeam()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_AwayTeam();

	/**
	 * Returns the meta object for the container reference '{@link competition.Score#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Match</em>'.
	 * @see competition.Score#getMatch()
	 * @see #getScore()
	 * @generated
	 */
	EReference getScore_Match();

	/**
	 * Returns the meta object for class '{@link competition.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see competition.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link competition.Goal#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see competition.Goal#getMinute()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Minute();

	/**
	 * Returns the meta object for the attribute '{@link competition.Goal#getExtraTime <em>Extra Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Time</em>'.
	 * @see competition.Goal#getExtraTime()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_ExtraTime();

	/**
	 * Returns the meta object for the container reference '{@link competition.Goal#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Match</em>'.
	 * @see competition.Goal#getMatch()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Match();

	/**
	 * Returns the meta object for the reference '{@link competition.Goal#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see competition.Goal#getTeam()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Team();

	/**
	 * Returns the meta object for the reference '{@link competition.Goal#getScorer <em>Scorer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scorer</em>'.
	 * @see competition.Goal#getScorer()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Scorer();

	/**
	 * Returns the meta object for the reference '{@link competition.Goal#getAssist <em>Assist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assist</em>'.
	 * @see competition.Goal#getAssist()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Assist();

	/**
	 * Returns the meta object for class '{@link competition.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see competition.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link competition.Booking#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see competition.Booking#getMinute()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Minute();

	/**
	 * Returns the meta object for the attribute '{@link competition.Booking#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card</em>'.
	 * @see competition.Booking#getCard()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Card();

	/**
	 * Returns the meta object for the container reference '{@link competition.Booking#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Match</em>'.
	 * @see competition.Booking#getMatch()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Match();

	/**
	 * Returns the meta object for the reference '{@link competition.Booking#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see competition.Booking#getTeam()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Team();

	/**
	 * Returns the meta object for the reference '{@link competition.Booking#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see competition.Booking#getPlayer()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Player();

	/**
	 * Returns the meta object for class '{@link competition.Substitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substitution</em>'.
	 * @see competition.Substitution
	 * @generated
	 */
	EClass getSubstitution();

	/**
	 * Returns the meta object for the attribute '{@link competition.Substitution#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see competition.Substitution#getMinute()
	 * @see #getSubstitution()
	 * @generated
	 */
	EAttribute getSubstitution_Minute();

	/**
	 * Returns the meta object for the container reference '{@link competition.Substitution#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Match</em>'.
	 * @see competition.Substitution#getMatch()
	 * @see #getSubstitution()
	 * @generated
	 */
	EReference getSubstitution_Match();

	/**
	 * Returns the meta object for the reference '{@link competition.Substitution#getPlayerOut <em>Player Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player Out</em>'.
	 * @see competition.Substitution#getPlayerOut()
	 * @see #getSubstitution()
	 * @generated
	 */
	EReference getSubstitution_PlayerOut();

	/**
	 * Returns the meta object for the reference '{@link competition.Substitution#getPlayerIn <em>Player In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player In</em>'.
	 * @see competition.Substitution#getPlayerIn()
	 * @see #getSubstitution()
	 * @generated
	 */
	EReference getSubstitution_PlayerIn();

	/**
	 * Returns the meta object for the reference '{@link competition.Substitution#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see competition.Substitution#getTeam()
	 * @see #getSubstitution()
	 * @generated
	 */
	EReference getSubstitution_Team();

	/**
	 * Returns the meta object for enum '{@link competition.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see competition.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the meta object for enum '{@link competition.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see competition.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link competition.Winner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winner</em>'.
	 * @see competition.Winner
	 * @generated
	 */
	EEnum getWinner();

	/**
	 * Returns the meta object for enum '{@link competition.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card</em>'.
	 * @see competition.Card
	 * @generated
	 */
	EEnum getCard();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompetitionFactory getCompetitionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link competition.impl.CompetitionImpl <em>Competition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.CompetitionImpl
		 * @see competition.impl.CompetitionPackageImpl#getCompetition()
		 * @generated
		 */
		EClass COMPETITION = eINSTANCE.getCompetition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPETITION__ID = eINSTANCE.getCompetition_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPETITION__NAME = eINSTANCE.getCompetition_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPETITION__CODE = eINSTANCE.getCompetition_Code();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPETITION__PLAN = eINSTANCE.getCompetition_Plan();

		/**
		 * The meta object literal for the '<em><b>Current Season</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETITION__CURRENT_SEASON = eINSTANCE.getCompetition_CurrentSeason();

		/**
		 * The meta object literal for the '<em><b>Last Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPETITION__LAST_UPDATED = eINSTANCE.getCompetition_LastUpdated();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETITION__TEAMS = eINSTANCE.getCompetition_Teams();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPETITION__AREA = eINSTANCE.getCompetition_Area();

		/**
		 * The meta object literal for the '{@link competition.impl.SeasonImpl <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.SeasonImpl
		 * @see competition.impl.CompetitionPackageImpl#getSeason()
		 * @generated
		 */
		EClass SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__ID = eINSTANCE.getSeason_Id();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__START_DATE = eINSTANCE.getSeason_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__END_DATE = eINSTANCE.getSeason_EndDate();

		/**
		 * The meta object literal for the '<em><b>Current Matchday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__CURRENT_MATCHDAY = eINSTANCE.getSeason_CurrentMatchday();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__MATCHES = eINSTANCE.getSeason_Matches();

		/**
		 * The meta object literal for the '<em><b>Competition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__COMPETITION = eINSTANCE.getSeason_Competition();

		/**
		 * The meta object literal for the '{@link competition.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.TeamImpl
		 * @see competition.impl.CompetitionPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__ID = eINSTANCE.getTeam_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__SHORT_NAME = eINSTANCE.getTeam_ShortName();

		/**
		 * The meta object literal for the '<em><b>Tla</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__TLA = eINSTANCE.getTeam_Tla();

		/**
		 * The meta object literal for the '<em><b>Founded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__FOUNDED = eINSTANCE.getTeam_Founded();

		/**
		 * The meta object literal for the '<em><b>Club Colors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__CLUB_COLORS = eINSTANCE.getTeam_ClubColors();

		/**
		 * The meta object literal for the '<em><b>Squad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__SQUAD = eINSTANCE.getTeam_Squad();

		/**
		 * The meta object literal for the '{@link competition.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.PersonImpl
		 * @see competition.impl.CompetitionPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ID = eINSTANCE.getPerson_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__POSITION = eINSTANCE.getPerson_Position();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DATE_OF_BIRTH = eINSTANCE.getPerson_DateOfBirth();

		/**
		 * The meta object literal for the '<em><b>Nationality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NATIONALITY = eINSTANCE.getPerson_Nationality();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ROLE = eINSTANCE.getPerson_Role();

		/**
		 * The meta object literal for the '{@link competition.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.MatchImpl
		 * @see competition.impl.CompetitionPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__ID = eINSTANCE.getMatch_Id();

		/**
		 * The meta object literal for the '<em><b>Utc Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__UTC_DATE = eINSTANCE.getMatch_UtcDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__STATUS = eINSTANCE.getMatch_Status();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__MINUTE = eINSTANCE.getMatch_Minute();

		/**
		 * The meta object literal for the '<em><b>Attendance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__ATTENDANCE = eINSTANCE.getMatch_Attendance();

		/**
		 * The meta object literal for the '<em><b>Venue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__VENUE = eINSTANCE.getMatch_Venue();

		/**
		 * The meta object literal for the '<em><b>Last Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__LAST_UPDATED = eINSTANCE.getMatch_LastUpdated();

		/**
		 * The meta object literal for the '<em><b>Home Team</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__HOME_TEAM = eINSTANCE.getMatch_HomeTeam();

		/**
		 * The meta object literal for the '<em><b>Away Team</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__AWAY_TEAM = eINSTANCE.getMatch_AwayTeam();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__SCORE = eINSTANCE.getMatch_Score();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__GOALS = eINSTANCE.getMatch_Goals();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__BOOKINGS = eINSTANCE.getMatch_Bookings();

		/**
		 * The meta object literal for the '<em><b>Substitutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__SUBSTITUTIONS = eINSTANCE.getMatch_Substitutions();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__SEASON = eINSTANCE.getMatch_Season();

		/**
		 * The meta object literal for the '{@link competition.impl.MatchTeamImpl <em>Match Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.MatchTeamImpl
		 * @see competition.impl.CompetitionPackageImpl#getMatchTeam()
		 * @generated
		 */
		EClass MATCH_TEAM = eINSTANCE.getMatchTeam();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_TEAM__TEAM = eINSTANCE.getMatchTeam_Team();

		/**
		 * The meta object literal for the '<em><b>Coach</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_TEAM__COACH = eINSTANCE.getMatchTeam_Coach();

		/**
		 * The meta object literal for the '<em><b>Captain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_TEAM__CAPTAIN = eINSTANCE.getMatchTeam_Captain();

		/**
		 * The meta object literal for the '<em><b>Lineup</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_TEAM__LINEUP = eINSTANCE.getMatchTeam_Lineup();

		/**
		 * The meta object literal for the '<em><b>Bench</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_TEAM__BENCH = eINSTANCE.getMatchTeam_Bench();

		/**
		 * The meta object literal for the '{@link competition.impl.ScoreImpl <em>Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.ScoreImpl
		 * @see competition.impl.CompetitionPackageImpl#getScore()
		 * @generated
		 */
		EClass SCORE = eINSTANCE.getScore();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__WINNER = eINSTANCE.getScore_Winner();

		/**
		 * The meta object literal for the '<em><b>Home Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__HOME_TEAM = eINSTANCE.getScore_HomeTeam();

		/**
		 * The meta object literal for the '<em><b>Away Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__AWAY_TEAM = eINSTANCE.getScore_AwayTeam();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE__MATCH = eINSTANCE.getScore_Match();

		/**
		 * The meta object literal for the '{@link competition.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.GoalImpl
		 * @see competition.impl.CompetitionPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__MINUTE = eINSTANCE.getGoal_Minute();

		/**
		 * The meta object literal for the '<em><b>Extra Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__EXTRA_TIME = eINSTANCE.getGoal_ExtraTime();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__MATCH = eINSTANCE.getGoal_Match();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__TEAM = eINSTANCE.getGoal_Team();

		/**
		 * The meta object literal for the '<em><b>Scorer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__SCORER = eINSTANCE.getGoal_Scorer();

		/**
		 * The meta object literal for the '<em><b>Assist</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ASSIST = eINSTANCE.getGoal_Assist();

		/**
		 * The meta object literal for the '{@link competition.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.BookingImpl
		 * @see competition.impl.CompetitionPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__MINUTE = eINSTANCE.getBooking_Minute();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CARD = eINSTANCE.getBooking_Card();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__MATCH = eINSTANCE.getBooking_Match();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__TEAM = eINSTANCE.getBooking_Team();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__PLAYER = eINSTANCE.getBooking_Player();

		/**
		 * The meta object literal for the '{@link competition.impl.SubstitutionImpl <em>Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.SubstitutionImpl
		 * @see competition.impl.CompetitionPackageImpl#getSubstitution()
		 * @generated
		 */
		EClass SUBSTITUTION = eINSTANCE.getSubstitution();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTION__MINUTE = eINSTANCE.getSubstitution_Minute();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION__MATCH = eINSTANCE.getSubstitution_Match();

		/**
		 * The meta object literal for the '<em><b>Player Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION__PLAYER_OUT = eINSTANCE.getSubstitution_PlayerOut();

		/**
		 * The meta object literal for the '<em><b>Player In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION__PLAYER_IN = eINSTANCE.getSubstitution_PlayerIn();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION__TEAM = eINSTANCE.getSubstitution_Team();

		/**
		 * The meta object literal for the '{@link competition.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.Role
		 * @see competition.impl.CompetitionPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link competition.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.Status
		 * @see competition.impl.CompetitionPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link competition.Winner <em>Winner</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.Winner
		 * @see competition.impl.CompetitionPackageImpl#getWinner()
		 * @generated
		 */
		EEnum WINNER = eINSTANCE.getWinner();

		/**
		 * The meta object literal for the '{@link competition.Card <em>Card</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.Card
		 * @see competition.impl.CompetitionPackageImpl#getCard()
		 * @generated
		 */
		EEnum CARD = eINSTANCE.getCard();

	}

} //CompetitionPackage
