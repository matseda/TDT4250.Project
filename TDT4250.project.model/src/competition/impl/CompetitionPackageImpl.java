/**
 */
package competition.impl;

import competition.Competition;
import competition.CompetitionFactory;
import competition.CompetitionPackage;
import competition.Match;
import competition.Matchday;
import competition.Positon;
import competition.Score;
import competition.Season;
import competition.Standing;
import competition.Status;
import competition.Team;
import competition.Winner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompetitionPackageImpl extends EPackageImpl implements CompetitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass competitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchdayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum winnerEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see competition.CompetitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompetitionPackageImpl() {
		super(eNS_URI, CompetitionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CompetitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompetitionPackage init() {
		if (isInited) return (CompetitionPackage)EPackage.Registry.INSTANCE.getEPackage(CompetitionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCompetitionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CompetitionPackageImpl theCompetitionPackage = registeredCompetitionPackage instanceof CompetitionPackageImpl ? (CompetitionPackageImpl)registeredCompetitionPackage : new CompetitionPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCompetitionPackage.createPackageContents();

		// Initialize created meta-data
		theCompetitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompetitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompetitionPackage.eNS_URI, theCompetitionPackage);
		return theCompetitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompetition() {
		return competitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompetition_Id() {
		return (EAttribute)competitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompetition_Name() {
		return (EAttribute)competitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompetition_Code() {
		return (EAttribute)competitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompetition_Plan() {
		return (EAttribute)competitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetition_CurrentSeason() {
		return (EReference)competitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompetition_LastUpdated() {
		return (EAttribute)competitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetition_Teams() {
		return (EReference)competitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompetition_Area() {
		return (EAttribute)competitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeason() {
		return seasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeason_Id() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeason_StartDate() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeason_EndDate() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeason_CurrentMatchday() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeason_Competition() {
		return (EReference)seasonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeason_Standing() {
		return (EReference)seasonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeason_Matchdays() {
		return (EReference)seasonEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeam() {
		return teamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_Id() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_Name() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_ShortName() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_Tla() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_Founded() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_ClubColors() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_Id() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_UtcDate() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_Status() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_LastUpdated() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_Score() {
		return (EReference)matchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_HomeTeam() {
		return (EReference)matchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_AwayTeam() {
		return (EReference)matchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScore() {
		return scoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScore_Winner() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScore_HomeTeam() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScore_AwayTeam() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScore_Match() {
		return (EReference)scoreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStanding() {
		return standingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStanding_Positions() {
		return (EReference)standingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositon() {
		return positonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositon_Position() {
		return (EAttribute)positonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPositon_Team() {
		return (EReference)positonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositon_PlayedGames() {
		return (EAttribute)positonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositon_Won() {
		return (EAttribute)positonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositon_Draw() {
		return (EAttribute)positonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositon_Lost() {
		return (EAttribute)positonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositon_Points() {
		return (EAttribute)positonEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositon_GoalsFor() {
		return (EAttribute)positonEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositon_GoalsAgaints() {
		return (EAttribute)positonEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositon_GoalDifference() {
		return (EAttribute)positonEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatchday() {
		return matchdayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatchday_Matchday() {
		return (EAttribute)matchdayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatchday_Matches() {
		return (EReference)matchdayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWinner() {
		return winnerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompetitionFactory getCompetitionFactory() {
		return (CompetitionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		competitionEClass = createEClass(COMPETITION);
		createEAttribute(competitionEClass, COMPETITION__ID);
		createEAttribute(competitionEClass, COMPETITION__NAME);
		createEAttribute(competitionEClass, COMPETITION__CODE);
		createEAttribute(competitionEClass, COMPETITION__PLAN);
		createEReference(competitionEClass, COMPETITION__CURRENT_SEASON);
		createEAttribute(competitionEClass, COMPETITION__LAST_UPDATED);
		createEReference(competitionEClass, COMPETITION__TEAMS);
		createEAttribute(competitionEClass, COMPETITION__AREA);

		seasonEClass = createEClass(SEASON);
		createEAttribute(seasonEClass, SEASON__ID);
		createEAttribute(seasonEClass, SEASON__START_DATE);
		createEAttribute(seasonEClass, SEASON__END_DATE);
		createEAttribute(seasonEClass, SEASON__CURRENT_MATCHDAY);
		createEReference(seasonEClass, SEASON__COMPETITION);
		createEReference(seasonEClass, SEASON__STANDING);
		createEReference(seasonEClass, SEASON__MATCHDAYS);

		teamEClass = createEClass(TEAM);
		createEAttribute(teamEClass, TEAM__ID);
		createEAttribute(teamEClass, TEAM__NAME);
		createEAttribute(teamEClass, TEAM__SHORT_NAME);
		createEAttribute(teamEClass, TEAM__TLA);
		createEAttribute(teamEClass, TEAM__FOUNDED);
		createEAttribute(teamEClass, TEAM__CLUB_COLORS);

		matchEClass = createEClass(MATCH);
		createEAttribute(matchEClass, MATCH__ID);
		createEAttribute(matchEClass, MATCH__UTC_DATE);
		createEAttribute(matchEClass, MATCH__STATUS);
		createEAttribute(matchEClass, MATCH__LAST_UPDATED);
		createEReference(matchEClass, MATCH__SCORE);
		createEReference(matchEClass, MATCH__HOME_TEAM);
		createEReference(matchEClass, MATCH__AWAY_TEAM);

		scoreEClass = createEClass(SCORE);
		createEAttribute(scoreEClass, SCORE__WINNER);
		createEAttribute(scoreEClass, SCORE__HOME_TEAM);
		createEAttribute(scoreEClass, SCORE__AWAY_TEAM);
		createEReference(scoreEClass, SCORE__MATCH);

		standingEClass = createEClass(STANDING);
		createEReference(standingEClass, STANDING__POSITIONS);

		positonEClass = createEClass(POSITON);
		createEAttribute(positonEClass, POSITON__POSITION);
		createEReference(positonEClass, POSITON__TEAM);
		createEAttribute(positonEClass, POSITON__PLAYED_GAMES);
		createEAttribute(positonEClass, POSITON__WON);
		createEAttribute(positonEClass, POSITON__DRAW);
		createEAttribute(positonEClass, POSITON__LOST);
		createEAttribute(positonEClass, POSITON__POINTS);
		createEAttribute(positonEClass, POSITON__GOALS_FOR);
		createEAttribute(positonEClass, POSITON__GOALS_AGAINTS);
		createEAttribute(positonEClass, POSITON__GOAL_DIFFERENCE);

		matchdayEClass = createEClass(MATCHDAY);
		createEAttribute(matchdayEClass, MATCHDAY__MATCHDAY);
		createEReference(matchdayEClass, MATCHDAY__MATCHES);

		// Create enums
		statusEEnum = createEEnum(STATUS);
		winnerEEnum = createEEnum(WINNER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(competitionEClass, Competition.class, "Competition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompetition_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Competition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompetition_Name(), ecorePackage.getEString(), "name", null, 1, 1, Competition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompetition_Code(), ecorePackage.getEString(), "code", null, 0, 1, Competition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompetition_Plan(), ecorePackage.getEString(), "plan", null, 0, 1, Competition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompetition_CurrentSeason(), this.getSeason(), this.getSeason_Competition(), "currentSeason", null, 0, 1, Competition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompetition_LastUpdated(), ecorePackage.getEDate(), "lastUpdated", null, 0, 1, Competition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompetition_Teams(), this.getTeam(), null, "teams", null, 1, -1, Competition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompetition_Area(), ecorePackage.getEString(), "area", null, 0, 1, Competition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seasonEClass, Season.class, "Season", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeason_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeason_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeason_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeason_CurrentMatchday(), ecorePackage.getEInt(), "currentMatchday", null, 0, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeason_Competition(), this.getCompetition(), this.getCompetition_CurrentSeason(), "competition", null, 0, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeason_Standing(), this.getStanding(), null, "standing", null, 0, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeason_Matchdays(), this.getMatchday(), null, "matchdays", null, 0, -1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeam_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_Name(), ecorePackage.getEString(), "name", null, 1, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_Tla(), ecorePackage.getEString(), "tla", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_Founded(), ecorePackage.getEInt(), "founded", null, 1, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_ClubColors(), ecorePackage.getEString(), "clubColors", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatch_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_UtcDate(), ecorePackage.getEDate(), "utcDate", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Status(), this.getStatus(), "status", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_LastUpdated(), ecorePackage.getEDate(), "lastUpdated", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Score(), this.getScore(), this.getScore_Match(), "score", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_HomeTeam(), this.getTeam(), null, "homeTeam", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_AwayTeam(), this.getTeam(), null, "awayTeam", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scoreEClass, Score.class, "Score", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScore_Winner(), this.getWinner(), "winner", null, 1, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScore_HomeTeam(), ecorePackage.getEInt(), "homeTeam", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScore_AwayTeam(), ecorePackage.getEInt(), "awayTeam", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScore_Match(), this.getMatch(), this.getMatch_Score(), "match", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standingEClass, Standing.class, "Standing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStanding_Positions(), this.getPositon(), null, "positions", null, 0, -1, Standing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positonEClass, Positon.class, "Positon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositon_Position(), ecorePackage.getEInt(), "position", null, 0, 1, Positon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositon_Team(), this.getTeam(), null, "team", null, 0, 1, Positon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositon_PlayedGames(), ecorePackage.getEInt(), "playedGames", null, 0, 1, Positon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositon_Won(), ecorePackage.getEInt(), "won", null, 0, 1, Positon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositon_Draw(), ecorePackage.getEInt(), "draw", null, 0, 1, Positon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositon_Lost(), ecorePackage.getEInt(), "lost", null, 0, 1, Positon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositon_Points(), ecorePackage.getEInt(), "points", null, 0, 1, Positon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositon_GoalsFor(), ecorePackage.getEInt(), "goalsFor", null, 0, 1, Positon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositon_GoalsAgaints(), ecorePackage.getEInt(), "goalsAgaints", null, 0, 1, Positon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositon_GoalDifference(), ecorePackage.getEInt(), "goalDifference", null, 0, 1, Positon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchdayEClass, Matchday.class, "Matchday", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchday_Matchday(), ecorePackage.getEInt(), "matchday", null, 0, 1, Matchday.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchday_Matches(), this.getMatch(), null, "matches", null, 0, -1, Matchday.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.FINISHED);
		addEEnumLiteral(statusEEnum, Status.AWARDED);
		addEEnumLiteral(statusEEnum, Status.IN_PLAY);
		addEEnumLiteral(statusEEnum, Status.PAUSED);
		addEEnumLiteral(statusEEnum, Status.CANCELED);
		addEEnumLiteral(statusEEnum, Status.SCHEDULED);
		addEEnumLiteral(statusEEnum, Status.POSTPONED);
		addEEnumLiteral(statusEEnum, Status.SUSPENDED);

		initEEnum(winnerEEnum, Winner.class, "Winner");
		addEEnumLiteral(winnerEEnum, Winner.HOME_TEAM);
		addEEnumLiteral(winnerEEnum, Winner.AWAY_TEAM);
		addEEnumLiteral(winnerEEnum, Winner.DRAW);

		// Create resource
		createResource(eNS_URI);
	}

} //CompetitionPackageImpl
