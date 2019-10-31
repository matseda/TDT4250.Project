/**
 */
package competition.impl;

import competition.CompetitionPackage;
import competition.Goal;
import competition.Match;
import competition.Person;
import competition.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link competition.impl.GoalImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link competition.impl.GoalImpl#getExtraTime <em>Extra Time</em>}</li>
 *   <li>{@link competition.impl.GoalImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link competition.impl.GoalImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link competition.impl.GoalImpl#getScorer <em>Scorer</em>}</li>
 *   <li>{@link competition.impl.GoalImpl#getAssist <em>Assist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends MinimalEObjectImpl.Container implements Goal {
	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected int minute = MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraTime() <em>Extra Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraTime()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTRA_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExtraTime() <em>Extra Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraTime()
	 * @generated
	 * @ordered
	 */
	protected int extraTime = EXTRA_TIME_EDEFAULT;

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
	 * The cached value of the '{@link #getScorer() <em>Scorer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScorer()
	 * @generated
	 * @ordered
	 */
	protected Person scorer;

	/**
	 * The cached value of the '{@link #getAssist() <em>Assist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssist()
	 * @generated
	 * @ordered
	 */
	protected Person assist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompetitionPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinute(int newMinute) {
		int oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExtraTime() {
		return extraTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtraTime(int newExtraTime) {
		int oldExtraTime = extraTime;
		extraTime = newExtraTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__EXTRA_TIME, oldExtraTime, extraTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Match getMatch() {
		if (eContainerFeatureID() != CompetitionPackage.GOAL__MATCH) return null;
		return (Match)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatch(Match newMatch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMatch, CompetitionPackage.GOAL__MATCH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatch(Match newMatch) {
		if (newMatch != eInternalContainer() || (eContainerFeatureID() != CompetitionPackage.GOAL__MATCH && newMatch != null)) {
			if (EcoreUtil.isAncestor(this, newMatch))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMatch != null)
				msgs = ((InternalEObject)newMatch).eInverseAdd(this, CompetitionPackage.MATCH__GOALS, Match.class, msgs);
			msgs = basicSetMatch(newMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__MATCH, newMatch, newMatch));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.GOAL__TEAM, oldTeam, team));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getScorer() {
		if (scorer != null && scorer.eIsProxy()) {
			InternalEObject oldScorer = (InternalEObject)scorer;
			scorer = (Person)eResolveProxy(oldScorer);
			if (scorer != oldScorer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.GOAL__SCORER, oldScorer, scorer));
			}
		}
		return scorer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetScorer() {
		return scorer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScorer(Person newScorer) {
		Person oldScorer = scorer;
		scorer = newScorer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__SCORER, oldScorer, scorer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getAssist() {
		if (assist != null && assist.eIsProxy()) {
			InternalEObject oldAssist = (InternalEObject)assist;
			assist = (Person)eResolveProxy(oldAssist);
			if (assist != oldAssist) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.GOAL__ASSIST, oldAssist, assist));
			}
		}
		return assist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetAssist() {
		return assist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssist(Person newAssist) {
		Person oldAssist = assist;
		assist = newAssist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__ASSIST, oldAssist, assist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.GOAL__MATCH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMatch((Match)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.GOAL__MATCH:
				return basicSetMatch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CompetitionPackage.GOAL__MATCH:
				return eInternalContainer().eInverseRemove(this, CompetitionPackage.MATCH__GOALS, Match.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompetitionPackage.GOAL__MINUTE:
				return getMinute();
			case CompetitionPackage.GOAL__EXTRA_TIME:
				return getExtraTime();
			case CompetitionPackage.GOAL__MATCH:
				return getMatch();
			case CompetitionPackage.GOAL__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
			case CompetitionPackage.GOAL__SCORER:
				if (resolve) return getScorer();
				return basicGetScorer();
			case CompetitionPackage.GOAL__ASSIST:
				if (resolve) return getAssist();
				return basicGetAssist();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompetitionPackage.GOAL__MINUTE:
				setMinute((Integer)newValue);
				return;
			case CompetitionPackage.GOAL__EXTRA_TIME:
				setExtraTime((Integer)newValue);
				return;
			case CompetitionPackage.GOAL__MATCH:
				setMatch((Match)newValue);
				return;
			case CompetitionPackage.GOAL__TEAM:
				setTeam((Team)newValue);
				return;
			case CompetitionPackage.GOAL__SCORER:
				setScorer((Person)newValue);
				return;
			case CompetitionPackage.GOAL__ASSIST:
				setAssist((Person)newValue);
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
			case CompetitionPackage.GOAL__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case CompetitionPackage.GOAL__EXTRA_TIME:
				setExtraTime(EXTRA_TIME_EDEFAULT);
				return;
			case CompetitionPackage.GOAL__MATCH:
				setMatch((Match)null);
				return;
			case CompetitionPackage.GOAL__TEAM:
				setTeam((Team)null);
				return;
			case CompetitionPackage.GOAL__SCORER:
				setScorer((Person)null);
				return;
			case CompetitionPackage.GOAL__ASSIST:
				setAssist((Person)null);
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
			case CompetitionPackage.GOAL__MINUTE:
				return minute != MINUTE_EDEFAULT;
			case CompetitionPackage.GOAL__EXTRA_TIME:
				return extraTime != EXTRA_TIME_EDEFAULT;
			case CompetitionPackage.GOAL__MATCH:
				return getMatch() != null;
			case CompetitionPackage.GOAL__TEAM:
				return team != null;
			case CompetitionPackage.GOAL__SCORER:
				return scorer != null;
			case CompetitionPackage.GOAL__ASSIST:
				return assist != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (minute: ");
		result.append(minute);
		result.append(", extraTime: ");
		result.append(extraTime);
		result.append(')');
		return result.toString();
	}

} //GoalImpl
