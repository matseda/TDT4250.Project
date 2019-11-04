/**
 */
package competition;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see competition.CompetitionPackage#getStatus()
 * @model
 * @generated
 */
public enum Status implements Enumerator {
	/**
	 * The '<em><b>FINISHED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHED_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHED(0, "FINISHED", "FINISHED"),

	/**
	 * The '<em><b>AWARDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWARDED_VALUE
	 * @generated
	 * @ordered
	 */
	AWARDED(1, "AWARDED", "AWARDED"),

	/**
	 * The '<em><b>IN PLAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PLAY_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PLAY(2, "IN_PLAY", "IN_PLAY"),

	/**
	 * The '<em><b>PAUSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSED_VALUE
	 * @generated
	 * @ordered
	 */
	PAUSED(3, "PAUSED", "PAUSED"),

	/**
	 * The '<em><b>CANCELED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELED(4, "CANCELED", "CANCELED"),

	/**
	 * The '<em><b>SCHEDULED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULED_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULED(5, "SCHEDULED", "SCHEDULED"),

	/**
	 * The '<em><b>POSTPONED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTPONED_VALUE
	 * @generated
	 * @ordered
	 */
	POSTPONED(6, "POSTPONED", "POSTPONED"),

	/**
	 * The '<em><b>SUSPENDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED(7, "SUSPENDED", "SUSPENDED");

	/**
	 * The '<em><b>FINISHED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINISHED_VALUE = 0;

	/**
	 * The '<em><b>AWARDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWARDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AWARDED_VALUE = 1;

	/**
	 * The '<em><b>IN PLAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PLAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_PLAY_VALUE = 2;

	/**
	 * The '<em><b>PAUSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAUSED_VALUE = 3;

	/**
	 * The '<em><b>CANCELED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANCELED_VALUE = 4;

	/**
	 * The '<em><b>SCHEDULED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULED_VALUE = 5;

	/**
	 * The '<em><b>POSTPONED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTPONED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSTPONED_VALUE = 6;

	/**
	 * The '<em><b>SUSPENDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED_VALUE = 7;

	/**
	 * An array of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Status[] VALUES_ARRAY =
		new Status[] {
			FINISHED,
			AWARDED,
			IN_PLAY,
			PAUSED,
			CANCELED,
			SCHEDULED,
			POSTPONED,
			SUSPENDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Status> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Status result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Status result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status get(int value) {
		switch (value) {
			case FINISHED_VALUE: return FINISHED;
			case AWARDED_VALUE: return AWARDED;
			case IN_PLAY_VALUE: return IN_PLAY;
			case PAUSED_VALUE: return PAUSED;
			case CANCELED_VALUE: return CANCELED;
			case SCHEDULED_VALUE: return SCHEDULED;
			case POSTPONED_VALUE: return POSTPONED;
			case SUSPENDED_VALUE: return SUSPENDED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Status(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Status
