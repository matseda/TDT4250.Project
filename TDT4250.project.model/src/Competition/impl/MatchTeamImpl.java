/**
 */
package Competition.impl;

import Competition.CompetitionPackage;
import Competition.MatchTeam;
import Competition.Person;
import Competition.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Competition.impl.MatchTeamImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link Competition.impl.MatchTeamImpl#getCoach <em>Coach</em>}</li>
 *   <li>{@link Competition.impl.MatchTeamImpl#getCaptain <em>Captain</em>}</li>
 *   <li>{@link Competition.impl.MatchTeamImpl#getLineup <em>Lineup</em>}</li>
 *   <li>{@link Competition.impl.MatchTeamImpl#getBench <em>Bench</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchTeamImpl extends MinimalEObjectImpl.Container implements MatchTeam {
	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected Team team;

	/**
	 * The cached value of the '{@link #getCoach() <em>Coach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoach()
	 * @generated
	 * @ordered
	 */
	protected Person coach;

	/**
	 * The cached value of the '{@link #getCaptain() <em>Captain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptain()
	 * @generated
	 * @ordered
	 */
	protected Person captain;

	/**
	 * The cached value of the '{@link #getLineup() <em>Lineup</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineup()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> lineup;

	/**
	 * The cached value of the '{@link #getBench() <em>Bench</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBench()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> bench;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchTeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompetitionPackage.Literals.MATCH_TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getTeam() {
		if (team != null && team.eIsProxy()) {
			InternalEObject oldTeam = (InternalEObject)team;
			team = (Team)eResolveProxy(oldTeam);
			if (team != oldTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.MATCH_TEAM__TEAM, oldTeam, team));
			}
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeam(Team newTeam) {
		Team oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH_TEAM__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getCoach() {
		if (coach != null && coach.eIsProxy()) {
			InternalEObject oldCoach = (InternalEObject)coach;
			coach = (Person)eResolveProxy(oldCoach);
			if (coach != oldCoach) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.MATCH_TEAM__COACH, oldCoach, coach));
			}
		}
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetCoach() {
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoach(Person newCoach) {
		Person oldCoach = coach;
		coach = newCoach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH_TEAM__COACH, oldCoach, coach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getCaptain() {
		if (captain != null && captain.eIsProxy()) {
			InternalEObject oldCaptain = (InternalEObject)captain;
			captain = (Person)eResolveProxy(oldCaptain);
			if (captain != oldCaptain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.MATCH_TEAM__CAPTAIN, oldCaptain, captain));
			}
		}
		return captain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetCaptain() {
		return captain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaptain(Person newCaptain) {
		Person oldCaptain = captain;
		captain = newCaptain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH_TEAM__CAPTAIN, oldCaptain, captain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getLineup() {
		if (lineup == null) {
			lineup = new EObjectResolvingEList<Person>(Person.class, this, CompetitionPackage.MATCH_TEAM__LINEUP);
		}
		return lineup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getBench() {
		if (bench == null) {
			bench = new EObjectResolvingEList<Person>(Person.class, this, CompetitionPackage.MATCH_TEAM__BENCH);
		}
		return bench;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompetitionPackage.MATCH_TEAM__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
			case CompetitionPackage.MATCH_TEAM__COACH:
				if (resolve) return getCoach();
				return basicGetCoach();
			case CompetitionPackage.MATCH_TEAM__CAPTAIN:
				if (resolve) return getCaptain();
				return basicGetCaptain();
			case CompetitionPackage.MATCH_TEAM__LINEUP:
				return getLineup();
			case CompetitionPackage.MATCH_TEAM__BENCH:
				return getBench();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompetitionPackage.MATCH_TEAM__TEAM:
				setTeam((Team)newValue);
				return;
			case CompetitionPackage.MATCH_TEAM__COACH:
				setCoach((Person)newValue);
				return;
			case CompetitionPackage.MATCH_TEAM__CAPTAIN:
				setCaptain((Person)newValue);
				return;
			case CompetitionPackage.MATCH_TEAM__LINEUP:
				getLineup().clear();
				getLineup().addAll((Collection<? extends Person>)newValue);
				return;
			case CompetitionPackage.MATCH_TEAM__BENCH:
				getBench().clear();
				getBench().addAll((Collection<? extends Person>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CompetitionPackage.MATCH_TEAM__TEAM:
				setTeam((Team)null);
				return;
			case CompetitionPackage.MATCH_TEAM__COACH:
				setCoach((Person)null);
				return;
			case CompetitionPackage.MATCH_TEAM__CAPTAIN:
				setCaptain((Person)null);
				return;
			case CompetitionPackage.MATCH_TEAM__LINEUP:
				getLineup().clear();
				return;
			case CompetitionPackage.MATCH_TEAM__BENCH:
				getBench().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CompetitionPackage.MATCH_TEAM__TEAM:
				return team != null;
			case CompetitionPackage.MATCH_TEAM__COACH:
				return coach != null;
			case CompetitionPackage.MATCH_TEAM__CAPTAIN:
				return captain != null;
			case CompetitionPackage.MATCH_TEAM__LINEUP:
				return lineup != null && !lineup.isEmpty();
			case CompetitionPackage.MATCH_TEAM__BENCH:
				return bench != null && !bench.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatchTeamImpl
