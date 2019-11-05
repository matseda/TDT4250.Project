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
	 * The feature id for the '<em><b>Competition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__COMPETITION = 4;

	/**
	 * The feature id for the '<em><b>Standing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__STANDING = 5;

	/**
	 * The feature id for the '<em><b>Matchdays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__MATCHDAYS = 6;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = 7;

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
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.MatchImpl
	 * @see competition.impl.CompetitionPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 3;

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
	 * The feature id for the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__LAST_UPDATED = 3;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SCORE = 4;

	/**
	 * The feature id for the '<em><b>Home Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_TEAM = 5;

	/**
	 * The feature id for the '<em><b>Away Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_TEAM = 6;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.ScoreImpl <em>Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.ScoreImpl
	 * @see competition.impl.CompetitionPackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 4;

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
	 * The meta object id for the '{@link competition.impl.StandingImpl <em>Standing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.StandingImpl
	 * @see competition.impl.CompetitionPackageImpl#getStanding()
	 * @generated
	 */
	int STANDING = 5;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__POSITIONS = 0;

	/**
	 * The number of structural features of the '<em>Standing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Standing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.PositonImpl <em>Positon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.PositonImpl
	 * @see competition.impl.CompetitionPackageImpl#getPositon()
	 * @generated
	 */
	int POSITON = 6;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON__TEAM = 1;

	/**
	 * The feature id for the '<em><b>Played Games</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON__PLAYED_GAMES = 2;

	/**
	 * The feature id for the '<em><b>Won</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON__WON = 3;

	/**
	 * The feature id for the '<em><b>Draw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON__DRAW = 4;

	/**
	 * The feature id for the '<em><b>Lost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON__LOST = 5;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON__POINTS = 6;

	/**
	 * The feature id for the '<em><b>Goals For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON__GOALS_FOR = 7;

	/**
	 * The feature id for the '<em><b>Goals Againts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON__GOALS_AGAINTS = 8;

	/**
	 * The feature id for the '<em><b>Goal Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON__GOAL_DIFFERENCE = 9;

	/**
	 * The number of structural features of the '<em>Positon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Positon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.impl.MatchdayImpl <em>Matchday</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.impl.MatchdayImpl
	 * @see competition.impl.CompetitionPackageImpl#getMatchday()
	 * @generated
	 */
	int MATCHDAY = 7;

	/**
	 * The feature id for the '<em><b>Matchday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHDAY__MATCHDAY = 0;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHDAY__MATCHES = 1;

	/**
	 * The number of structural features of the '<em>Matchday</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHDAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matchday</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHDAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link competition.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.Status
	 * @see competition.impl.CompetitionPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 8;

	/**
	 * The meta object id for the '{@link competition.Winner <em>Winner</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see competition.Winner
	 * @see competition.impl.CompetitionPackageImpl#getWinner()
	 * @generated
	 */
	int WINNER = 9;


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
	 * Returns the meta object for the containment reference '{@link competition.Season#getStanding <em>Standing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standing</em>'.
	 * @see competition.Season#getStanding()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Standing();

	/**
	 * Returns the meta object for the containment reference list '{@link competition.Season#getMatchdays <em>Matchdays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchdays</em>'.
	 * @see competition.Season#getMatchdays()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Matchdays();

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
	 * Returns the meta object for the reference '{@link competition.Match#getHomeTeam <em>Home Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home Team</em>'.
	 * @see competition.Match#getHomeTeam()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_HomeTeam();

	/**
	 * Returns the meta object for the reference '{@link competition.Match#getAwayTeam <em>Away Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Away Team</em>'.
	 * @see competition.Match#getAwayTeam()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_AwayTeam();

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
	 * Returns the meta object for class '{@link competition.Standing <em>Standing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standing</em>'.
	 * @see competition.Standing
	 * @generated
	 */
	EClass getStanding();

	/**
	 * Returns the meta object for the containment reference list '{@link competition.Standing#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see competition.Standing#getPositions()
	 * @see #getStanding()
	 * @generated
	 */
	EReference getStanding_Positions();

	/**
	 * Returns the meta object for class '{@link competition.Positon <em>Positon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positon</em>'.
	 * @see competition.Positon
	 * @generated
	 */
	EClass getPositon();

	/**
	 * Returns the meta object for the attribute '{@link competition.Positon#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see competition.Positon#getPosition()
	 * @see #getPositon()
	 * @generated
	 */
	EAttribute getPositon_Position();

	/**
	 * Returns the meta object for the reference '{@link competition.Positon#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see competition.Positon#getTeam()
	 * @see #getPositon()
	 * @generated
	 */
	EReference getPositon_Team();

	/**
	 * Returns the meta object for the attribute '{@link competition.Positon#getPlayedGames <em>Played Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Played Games</em>'.
	 * @see competition.Positon#getPlayedGames()
	 * @see #getPositon()
	 * @generated
	 */
	EAttribute getPositon_PlayedGames();

	/**
	 * Returns the meta object for the attribute '{@link competition.Positon#getWon <em>Won</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Won</em>'.
	 * @see competition.Positon#getWon()
	 * @see #getPositon()
	 * @generated
	 */
	EAttribute getPositon_Won();

	/**
	 * Returns the meta object for the attribute '{@link competition.Positon#getDraw <em>Draw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draw</em>'.
	 * @see competition.Positon#getDraw()
	 * @see #getPositon()
	 * @generated
	 */
	EAttribute getPositon_Draw();

	/**
	 * Returns the meta object for the attribute '{@link competition.Positon#getLost <em>Lost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lost</em>'.
	 * @see competition.Positon#getLost()
	 * @see #getPositon()
	 * @generated
	 */
	EAttribute getPositon_Lost();

	/**
	 * Returns the meta object for the attribute '{@link competition.Positon#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see competition.Positon#getPoints()
	 * @see #getPositon()
	 * @generated
	 */
	EAttribute getPositon_Points();

	/**
	 * Returns the meta object for the attribute '{@link competition.Positon#getGoalsFor <em>Goals For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals For</em>'.
	 * @see competition.Positon#getGoalsFor()
	 * @see #getPositon()
	 * @generated
	 */
	EAttribute getPositon_GoalsFor();

	/**
	 * Returns the meta object for the attribute '{@link competition.Positon#getGoalsAgaints <em>Goals Againts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals Againts</em>'.
	 * @see competition.Positon#getGoalsAgaints()
	 * @see #getPositon()
	 * @generated
	 */
	EAttribute getPositon_GoalsAgaints();

	/**
	 * Returns the meta object for the attribute '{@link competition.Positon#getGoalDifference <em>Goal Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Difference</em>'.
	 * @see competition.Positon#getGoalDifference()
	 * @see #getPositon()
	 * @generated
	 */
	EAttribute getPositon_GoalDifference();

	/**
	 * Returns the meta object for class '{@link competition.Matchday <em>Matchday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matchday</em>'.
	 * @see competition.Matchday
	 * @generated
	 */
	EClass getMatchday();

	/**
	 * Returns the meta object for the attribute '{@link competition.Matchday#getMatchday <em>Matchday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matchday</em>'.
	 * @see competition.Matchday#getMatchday()
	 * @see #getMatchday()
	 * @generated
	 */
	EAttribute getMatchday_Matchday();

	/**
	 * Returns the meta object for the containment reference list '{@link competition.Matchday#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see competition.Matchday#getMatches()
	 * @see #getMatchday()
	 * @generated
	 */
	EReference getMatchday_Matches();

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
		 * The meta object literal for the '<em><b>Competition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__COMPETITION = eINSTANCE.getSeason_Competition();

		/**
		 * The meta object literal for the '<em><b>Standing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__STANDING = eINSTANCE.getSeason_Standing();

		/**
		 * The meta object literal for the '<em><b>Matchdays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__MATCHDAYS = eINSTANCE.getSeason_Matchdays();

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
		 * The meta object literal for the '<em><b>Last Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__LAST_UPDATED = eINSTANCE.getMatch_LastUpdated();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__SCORE = eINSTANCE.getMatch_Score();

		/**
		 * The meta object literal for the '<em><b>Home Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__HOME_TEAM = eINSTANCE.getMatch_HomeTeam();

		/**
		 * The meta object literal for the '<em><b>Away Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__AWAY_TEAM = eINSTANCE.getMatch_AwayTeam();

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
		 * The meta object literal for the '{@link competition.impl.StandingImpl <em>Standing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.StandingImpl
		 * @see competition.impl.CompetitionPackageImpl#getStanding()
		 * @generated
		 */
		EClass STANDING = eINSTANCE.getStanding();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDING__POSITIONS = eINSTANCE.getStanding_Positions();

		/**
		 * The meta object literal for the '{@link competition.impl.PositonImpl <em>Positon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.PositonImpl
		 * @see competition.impl.CompetitionPackageImpl#getPositon()
		 * @generated
		 */
		EClass POSITON = eINSTANCE.getPositon();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITON__POSITION = eINSTANCE.getPositon_Position();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITON__TEAM = eINSTANCE.getPositon_Team();

		/**
		 * The meta object literal for the '<em><b>Played Games</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITON__PLAYED_GAMES = eINSTANCE.getPositon_PlayedGames();

		/**
		 * The meta object literal for the '<em><b>Won</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITON__WON = eINSTANCE.getPositon_Won();

		/**
		 * The meta object literal for the '<em><b>Draw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITON__DRAW = eINSTANCE.getPositon_Draw();

		/**
		 * The meta object literal for the '<em><b>Lost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITON__LOST = eINSTANCE.getPositon_Lost();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITON__POINTS = eINSTANCE.getPositon_Points();

		/**
		 * The meta object literal for the '<em><b>Goals For</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITON__GOALS_FOR = eINSTANCE.getPositon_GoalsFor();

		/**
		 * The meta object literal for the '<em><b>Goals Againts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITON__GOALS_AGAINTS = eINSTANCE.getPositon_GoalsAgaints();

		/**
		 * The meta object literal for the '<em><b>Goal Difference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITON__GOAL_DIFFERENCE = eINSTANCE.getPositon_GoalDifference();

		/**
		 * The meta object literal for the '{@link competition.impl.MatchdayImpl <em>Matchday</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see competition.impl.MatchdayImpl
		 * @see competition.impl.CompetitionPackageImpl#getMatchday()
		 * @generated
		 */
		EClass MATCHDAY = eINSTANCE.getMatchday();

		/**
		 * The meta object literal for the '<em><b>Matchday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHDAY__MATCHDAY = eINSTANCE.getMatchday_Matchday();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHDAY__MATCHES = eINSTANCE.getMatchday_Matches();

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

	}

} //CompetitionPackage
